package cn.hp.controller;

import cn.hp.bean.BaseData;
import cn.hp.bean.BaseResultA1Data;
import cn.hp.bean.BaseResultData;
import cn.hp.bean.PictureData;
import cn.hp.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HpDataController {
//
//    @Autowired
//    DataService dataService;
//
//
//    @CrossOrigin
//    @RequestMapping("/get_h1")
//    @ResponseBody
//    public BaseResultData getH1Datas(@RequestParam int hour) {
//        //每分钟得到最新数据数据
//        return dataService.getH1Datas(hour);
//    }
//
//    @CrossOrigin
//    @RequestMapping("/get_pressure1")
//    @ResponseBody
//    public BaseResultData getPressure1Datas(@RequestParam int hour) {
//        //每分钟得到最新数据数据
//        return dataService.getPressure1Datas(hour);
//    }
//
//    @CrossOrigin
//    @RequestMapping("/get_rainfall")
//    @ResponseBody
//    public BaseResultData getRainfall(@RequestParam int hour) {
//        //每分钟得到最新数据数据
//        return dataService.getRainfall(hour);
//    }
//
//    @CrossOrigin
//    @RequestMapping("/get_a1_last")
//    @ResponseBody
//    public BaseResultA1Data getA1Last() {
//        //每分钟得到最新数据数据
//        return dataService.getA1();
//    }
//
//    @CrossOrigin
//    @RequestMapping("/getNewPicture")
//    @ResponseBody
//    public PictureData getNewPicture() {
//        //每分钟得到最新数据数据
//        return dataService.getNewPicture();
//    }

}
