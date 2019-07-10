package cn.hp.bean;

import java.util.List;

public class BaseA1Data {
    private String id;
    private List<String> nums;
    private String time;

    public BaseA1Data(String id, List<String> nums, String time) {
        this.id = id;
        this.nums = nums;
        this.time = time;
    }

    public BaseA1Data() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getNums() {
        return nums;
    }

    public void setNums(List<String> nums) {
        this.nums = nums;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
