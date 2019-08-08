package cn.hp.service;

import cn.hp.bean.*;
import cn.hp.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DataService {
    @Autowired
    DataMapper dataMapper;

    public BaseResultData getPressure1_mean(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getPressure1_mean(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBasePressure1_mean(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getA1_variance(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getA1_variance(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBaseA1_variance(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getT1(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getT1(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBaseT1(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getHumidity1_mean(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getHumidity1_mean(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBaseHumidity1_mean(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getrainfall_mean(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getrainfall_mean(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBaserainfall_mean(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getilluminance_mean(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getilluminance_mean(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBaseilluminance_mean(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getV1_mean(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getV1_mean(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBaseV1_mean(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }

    public BaseResultData getdisplacement1_mean(int min) {
        int limitNum = min * 60;
        List<BaseData> baseDataList = dataMapper.getdisplacement1_mean(limitNum);
        Collections.reverse(baseDataList);
        BaseNumData baseNumData = dataMapper.getBasedisplacement1_mean(limitNum);
        BaseResultData baseResultData = new BaseResultData();
        baseResultData.setBaseDataList(baseDataList);
        baseResultData.setBaseNumData(baseNumData);
        return baseResultData;
    }


    double max_a1 = 0;
    double min_a1 = 0;

//    public BaseResultA1Data getA1() {
//        int limitNum = 1;
//        List<BaseData> baseDataList = dataMapper.getA1(limitNum);
//        Collections.reverse(baseDataList);
//        BaseResultData baseResultData = new BaseResultData();
//        baseResultData.setBaseDataList(baseDataList);
//
//        BaseResultA1Data baseResultA1Data = new BaseResultA1Data();
//
//
//        String[] nums_string = baseResultData.getBaseDataList().get(0).getNum().split("and");
//        double[] nums_double = Arrays.stream(nums_string).mapToDouble(Double::valueOf).toArray();
//        List<Double> nums = doubleToList(nums_double);
//        List<String> nums_strings = Arrays.asList(nums_string);
//        baseResultA1Data.getBaseDataList().add(new BaseA1Data(baseResultData.getBaseDataList().get(0).getId(), nums_strings, baseResultData.getBaseDataList().get(0).getTime()));
//
//
//        baseResultA1Data.getBaseNumData().setMax(max_a1 + "");
//        baseResultA1Data.getBaseNumData().setMin(min_a1 + "");
//        baseResultA1Data.getBaseNumData().setAvg((max_a1 + min_a1) / 2 + "");
//
//        return baseResultA1Data;
//    }


    public PictureData getNewPicture() {
        return dataMapper.getNewPicture();
    }

    public List<Double> doubleToList(double[] arr_double) {
        List<Double> list = new ArrayList<Double>();
        int num = arr_double.length;
        Double[] arr_Double = new Double[num];
        for (int i = 0; i < num; i++) {
            arr_Double[i] = arr_double[i];//double[]转Double[]
            if (i == 0) {
                max_a1 = arr_double[i];
                min_a1 = arr_double[i];
            } else if (arr_double[i] > max_a1) {
                max_a1 = arr_double[i];
            } else if (arr_double[i] < min_a1) {
                min_a1 = arr_double[i];
            }

        }
        list = Arrays.asList(arr_Double);//Double[]转List
        return list;
    }
}
