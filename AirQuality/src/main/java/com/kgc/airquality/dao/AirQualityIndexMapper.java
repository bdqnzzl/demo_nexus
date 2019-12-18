package com.kgc.airquality.dao;

import com.kgc.airquality.pojo.AirQualityIndex;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AirQualityIndexMapper {

    //A.按区域查询空气质量记录
    public List<AirQualityIndex> getDataByCondition(String disName);

    //B.添加新的空气质量记录
    public int addData(AirQualityIndex airQualityIndex);

    //根据ID查找指定的记录
    public AirQualityIndex getDataById(int id);

    //修改指定记录
    public int updataData(AirQualityIndex airQualityIndex);

    //E.删除指定记录
    public int deleteData(int id);

}
