package cn.hp.socket;

import lombok.Data;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Data
@Component
public class DelongServerSocket {
    private Integer port = 11186;
    private boolean started;
    private ServerSocket ss;
    public static ConcurrentHashMap<String, ClientSocket> clientsMap = new ConcurrentHashMap<>();
    private ExecutorService executorService = Executors.newCachedThreadPool();
    Logger logger = Logger.getLogger(this.getClass());

    public static void main(String[] args) {
        new DelongServerSocket().start(11186);
    }

    public void start() {
        start(null);
    }

    public void start(Integer port) {
        try {
            ss = new ServerSocket(port == null ? this.port : port);
            started = true;
            logger.debug("c已开启,占用10086端口号....");
        } catch (Exception e) {
            logger.debug("端口使用中....");
            logger.debug("请关掉相关程序并重新运行服务器！");
            e.printStackTrace();
            System.exit(0);
        }

        try {
            while (started) {
                Socket socket = ss.accept();
                socket.setKeepAlive(true);
                ClientSocket register = ClientSocket.register(socket);
                logger.debug(register.receive());
                logger.debug("a client connected!");
                if (register != null) {
                    executorService.submit(register);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}