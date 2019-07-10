package cn.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class BaseResultA1Data {
    private BaseNumData baseNumData;
    private List<BaseA1Data> baseDataList;


    public BaseResultA1Data() {
        baseNumData = new BaseNumData("","","");
        baseDataList = new ArrayList<>();
    }

    public BaseNumData getBaseNumData() {
        return baseNumData;
    }

    public void setBaseNumData(BaseNumData baseNumData) {
        this.baseNumData = baseNumData;
    }

    public List<BaseA1Data> getBaseDataList() {
        return baseDataList;
    }

    public void setBaseDataList(List<BaseA1Data> baseDataList) {
        this.baseDataList = baseDataList;
    }
}
