package com.kgc.airquality.service;

import com.kgc.airquality.dao.DistrictMapper;
import com.kgc.airquality.pojo.District;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DistrictServiceImpl implements  DistrictService{

    @Resource
    private DistrictMapper districtMapper;

    // //查询所有区域信息
    public List<District> getAllData(){

        return districtMapper.getAllData();
    }

}
