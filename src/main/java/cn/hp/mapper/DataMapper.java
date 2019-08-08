package cn.hp.mapper;

import cn.hp.bean.BaseData;
import cn.hp.bean.BaseNumData;
import cn.hp.bean.PictureData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataMapper {
    List<BaseData> getPressure1_mean(@Param("limitNum") int limitNum);

    List<BaseData> getA1_variance(@Param("limitNum") int limitNum);

    List<BaseData> getT1(@Param("limitNum") int limitNum);

    List<BaseData> getHumidity1_mean(@Param("limitNum") int limitNum);

    List<BaseData> getrainfall_mean(@Param("limitNum") int limitNum);

    List<BaseData> getilluminance_mean(@Param("limitNum") int limitNum);

    List<BaseData> getV1_mean(@Param("limitNum") int limitNum);

    List<BaseData> getdisplacement1_mean(@Param("limitNum") int limitNum);

    BaseNumData getBasePressure1_mean(@Param("limitNum") int limitNum);

    BaseNumData getBaseA1_variance(@Param("limitNum") int limitNum);

    BaseNumData getBaseT1(@Param("limitNum") int limitNum);

    BaseNumData getBaseHumidity1_mean(@Param("limitNum") int limitNum);

    BaseNumData getBaserainfall_mean(@Param("limitNum") int limitNum);

    BaseNumData getBaseilluminance_mean(@Param("limitNum") int limitNum);

    BaseNumData getBaseV1_mean(@Param("limitNum") int limitNum);

    BaseNumData getBasedisplacement1_mean(@Param("limitNum") int limitNum);

    PictureData getNewPicture();
}
