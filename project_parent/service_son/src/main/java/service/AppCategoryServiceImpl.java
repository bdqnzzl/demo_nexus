package service;

import dao.AppCategoryMapper;
import entity.AppCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppCategoryServiceImpl {

    @Resource
    private AppCategoryMapper appCategoryMapper;

    public List<AppCategory> getFirstList(){

        return appCategoryMapper.getFirstList();
    }

    public List<AppCategory> getSecondList(String firstId){

        return appCategoryMapper.getSecondList(firstId);
    }

    public List<AppCategory> getThirdList(String secondId){

        return appCategoryMapper.getThirdList(secondId);
    }
}
