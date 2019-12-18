package com.kgc.airquality.dao;

import com.kgc.airquality.pojo.District;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DistrictMapper {
    // //查询所有区域信息
    public List<District> getAllData();
}
