package cn.hp.mapper;

import cn.hp.bean.BaseData;
import cn.hp.bean.BaseNumData;
import cn.hp.bean.PictureData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DataMapper {
    List<BaseData> getT1List(@Param("limitNum") int limitNum);

    List<BaseData> getH1List(@Param("limitNum") int limitNum);

    List<BaseData> getPressure1Datas(@Param("limitNum") int limitNum);

    List<BaseData> getRainfall(@Param("limitNum") int limitNum);

    List<BaseData> getA1(@Param("limitNum") int limitNum);

    BaseNumData getBaseT1Nums(@Param("limitNum") int limitNum);

    BaseNumData getBaseH1Nums(@Param("limitNum") int limitNum);

    BaseNumData getBasePressure1Nums(@Param("limitNum") int limitNum);

    BaseNumData getBaseRainfallNums(@Param("limitNum") int limitNum);

    PictureData getNewPicture();
}
