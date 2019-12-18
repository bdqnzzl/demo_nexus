package com.kgc.airquality.controller;

import com.kgc.airquality.pojo.District;
import com.kgc.airquality.service.DistrictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
public class DistrictController {

    @Resource
    private DistrictService districtService;

    @RequestMapping("/dislist")
    public List<District> getAllDis(){
        return districtService.getAllData();
    }

}
