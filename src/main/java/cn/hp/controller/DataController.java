package cn.hp.controller;

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

@Controller
public class DataController {

    @Autowired
    DataService dataService;

    @CrossOrigin
    @RequestMapping("/get_Pressure1_mean")
    @ResponseBody
    public BaseResultData getPressure1_mean(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getPressure1_mean(hour);
    }

    @CrossOrigin
    @RequestMapping("/get_A1_variance")
    @ResponseBody
    public BaseResultData getA1_variance(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getA1_variance(hour);
    }

    @CrossOrigin
    @RequestMapping("/get_T1")
    @ResponseBody
    public BaseResultData getT1(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getT1(hour);
    }

    @CrossOrigin
    @RequestMapping("/get_Humidity1_mean")
    @ResponseBody
    public BaseResultData getHumidity1_mean(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getHumidity1_mean(hour);
    }


    @CrossOrigin
    @RequestMapping("/get_rainfall_mean")
    @ResponseBody
    public BaseResultData getrainfall_mean(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getrainfall_mean(hour);
    }

    @CrossOrigin
    @RequestMapping("/get_illuminance_mean")
    @ResponseBody
    public BaseResultData getilluminance_mean(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getilluminance_mean(hour);
    }

    @CrossOrigin
    @RequestMapping("/get_displacement1_mean")
    @ResponseBody
    public BaseResultData getdisplacement1_mean(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getdisplacement1_mean(hour);
    }

    @CrossOrigin
    @RequestMapping("/get_V1_mean")
    @ResponseBody
    public BaseResultData getV1_mean(@RequestParam int hour) {
        //每分钟得到最新数据数据
        return dataService.getV1_mean(hour);
    }
}
