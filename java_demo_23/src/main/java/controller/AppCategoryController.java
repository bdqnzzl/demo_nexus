package controller;

import entity.AppCategory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AppCategoryServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AppCategoryController {

    @Resource
    private AppCategoryServiceImpl appCategoryServiceImpl;

    //跳转页面并显示一级菜单
    @RequestMapping("list_first")
    public String getFirstList(Model model) throws Exception{
        List<AppCategory> list_first = appCategoryServiceImpl.getFirstList();
        model.addAttribute("list_first",list_first);
        return "list";
    }

    @RequestMapping("get_second")
    @ResponseBody
    public List<AppCategory> getSecondList(String firstId) throws Exception{
        List<AppCategory> list_second = appCategoryServiceImpl.getSecondList(firstId);
        return list_second;
    }

    @RequestMapping("get_third")
    @ResponseBody
    public List<AppCategory> getThirdList(String secondId) throws Exception{
        List<AppCategory> list_third = appCategoryServiceImpl.getThirdList(secondId);
        return list_third;
    }
}
