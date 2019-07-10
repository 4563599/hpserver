package cn.hp.bean;

import java.util.List;

public class BaseResultData {
    private BaseNumData baseNumData;
    private List<BaseData> baseDataList;


    public BaseResultData(BaseNumData baseNumData, List<BaseData> baseDataList) {
        this.baseNumData = baseNumData;
        this.baseDataList = baseDataList;
    }

    public BaseResultData() {
        this.baseNumData = baseNumData;
        this.baseDataList = baseDataList;
    }

    public BaseNumData getBaseNumData() {
        return baseNumData;
    }

    public void setBaseNumData(BaseNumData baseNumData) {
        this.baseNumData = baseNumData;
    }

    public List<BaseData> getBaseDataList() {
        return baseDataList;
    }

    public void setBaseDataList(List<BaseData> baseDataList) {
        this.baseDataList = baseDataList;
    }
}
