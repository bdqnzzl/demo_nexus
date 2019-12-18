package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Invitation;
import service.InvitationService;
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
}
