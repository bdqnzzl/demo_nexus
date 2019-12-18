package com.kgc.airquality.service;

import com.kgc.airquality.dao.AirQualityIndexMapper;
import com.kgc.airquality.pojo.AirQualityIndex;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AirQualityIndexServiceImpl implements  AirQualityIndexService {

    @Resource
    private AirQualityIndexMapper airQualityIndexMapper;

    public AirQualityIndexMapper getAirQualityIndexMapper() {
        return airQualityIndexMapper;
    }

    public void setAirQualityIndexMapper(AirQualityIndexMapper airQualityIndexMapper) {
        this.airQualityIndexMapper = airQualityIndexMapper;
    }

    @Override
    public List<AirQualityIndex> getDataByCondition(String disName) {
        return airQualityIndexMapper.getDataByCondition(disName);
    }

    @Override
    public int addData(AirQualityIndex airQualityIndex) {
        return airQualityIndexMapper.addData(airQualityIndex);
    }

    @Override
    public AirQualityIndex getDataById(int id) {
        return airQualityIndexMapper.getDataById(id);
    }

    @Override
    public int updataData(AirQualityIndex airQualityIndex) {
        return airQualityIndexMapper.updataData(airQualityIndex);
    }

    @Override
    public int deleteData(int id) {
        return airQualityIndexMapper.deleteData(id);
    }
}
