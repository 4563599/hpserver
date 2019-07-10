package cn.hp.bean;

public class BaseData {
    private String id;
    private String num;
    private String time;


    public BaseData(String id, String num, String time) {
        this.id = id;
        this.num = num;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
