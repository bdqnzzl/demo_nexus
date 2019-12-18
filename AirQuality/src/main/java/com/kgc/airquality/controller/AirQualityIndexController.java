package com.kgc.airquality.controller;

import com.kgc.airquality.pojo.AirQualityIndex;
import com.kgc.airquality.service.AirQualityIndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class AirQualityIndexController {

    @Resource
    private AirQualityIndexService airQualityIndexService;

    @RequestMapping("/list")
    public List<AirQualityIndex> list(@RequestParam(name="disName",required = false) String disName){
        //log.trace(disName);
        List<AirQualityIndex> list_air = airQualityIndexService.getDataByCondition(disName);
        return list_air;
    }

    @RequestMapping("/getAirById")
    public AirQualityIndex getAirData(@RequestParam(name="id",required = false) String id){
        return airQualityIndexService.getDataById(Integer.parseInt(id));
    }

    @RequestMapping("/save")
    public int save(AirQualityIndex aqi){
        return airQualityIndexService.updataData(aqi);
    }

    @RequestMapping("/add_save")
    public int add_save(AirQualityIndex aqi){
        return airQualityIndexService.addData(aqi);
    }
}
