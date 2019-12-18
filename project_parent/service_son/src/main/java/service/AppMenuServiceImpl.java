package service;

import dao.AppMenuMapper;
import entity.AppMenu;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AppMenuServiceImpl {

    @Resource
    private AppMenuMapper appMenuMapper;

    public List<AppMenu> getMenuList(){

        return appMenuMapper.getMenuList();
    }

}
