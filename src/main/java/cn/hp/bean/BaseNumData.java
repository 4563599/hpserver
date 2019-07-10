package cn.hp.bean;

public class BaseNumData {
    private String max;
    private String min;
    private String avg;


    public BaseNumData(String max, String min, String avg) {
        this.max = max;
        this.min = min;
        this.avg = avg;
    }


    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }
}
