package com.bdqn.demo_spring_boot.controller;
import com.bdqn.demo_spring_boot.pojo.Invitation;
import com.bdqn.demo_spring_boot.service.InvitationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class InvitationController {
    @Resource
    private InvitationService invitationServiceImpl;

    @RequestMapping("list")
    public String list(String title, String currentPage, Model model){
        int pageSize=3;
        if(currentPage==null||"".equals(currentPage)){
            currentPage="1";
        }
        List<Invitation> list = invitationServiceImpl.getInvitationList(title, pageSize, Integer.parseInt(currentPage));
        int count = invitationServiceImpl.getInvitationCount(title);
        if(title==null||"".equals(title)){
            title="123";
        }
        model.addAttribute("list", list);
        model.addAttribute("title", title);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totelPage",count%pageSize==0?count/pageSize:count/pageSize+1);
        return "list";
    }
    @RequestMapping("delete")
    public String delete(int id){
        if(invitationServiceImpl.delete(id)>0){
            return "redirect:/list.html";
        }
        return "list";
    }

    @RequestMapping("list123")
    @ResponseBody
    public List<Invitation>  list123(String title, String currentPage, Model model){
        int pageSize=3;
        if(currentPage==null||"".equals(currentPage)){
            currentPage="1";
        }
        List<Invitation> list = invitationServiceImpl.getInvitationList(title, pageSize, Integer.parseInt(currentPage));
        return list;
    }
}
