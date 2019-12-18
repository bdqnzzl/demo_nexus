package controller;

import entity.AppMenu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import service.AppMenuServiceImpl;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AppMenuController {

    @Resource
    private AppMenuServiceImpl appMenuServiceImpl;

    //跳转页面并显示一级菜单
    @RequestMapping("list_menu")
    public String getFirstList(Model model) throws Exception{
        List<AppMenu> list_menu = appMenuServiceImpl.getMenuList();
        model.addAttribute("list_menu",list_menu);
        return "list_menu";
    }

}
