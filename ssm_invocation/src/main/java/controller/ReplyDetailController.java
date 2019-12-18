package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pojo.ReplyDetail;
import service.ReplyDetailService;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ReplyDetailController {
    @Resource
    private ReplyDetailService replyDetailServiceImpl;
    @RequestMapping("replyList")
    public String getReplyList(int id,String currentPage, Model model){
        int pageSize=3;
        if(currentPage==null||"".equals(currentPage)){
            currentPage="1";
        }
        List<ReplyDetail> replylist=replyDetailServiceImpl.getReplyDetailList(id,pageSize, Integer.parseInt(currentPage));
        int count=replyDetailServiceImpl.getReplyDetailCount(id);
        model.addAttribute("list", replylist);
        model.addAttribute("currentPage", currentPage);
        model.addAttribute("totelPage",count%pageSize==0?count/pageSize:count/pageSize+1);
        return "replyList";
    }
    @RequestMapping(value ="replyAdd.html",method = RequestMethod.GET)
    public String add(@ModelAttribute("replyDetail")ReplyDetail replyDetail){
        return "replyAdd";
    }
    @RequestMapping("addSave")
    public String  addSave(ReplyDetail replyDetail){
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String date=sf.format(new Date());
        replyDetail.setCreatedate(date);
        if(replyDetailServiceImpl.add(replyDetail)>0){
            return "redirect:/replyList.html";
        }
        return "replyAdd";
    }
    @RequestMapping("replydelete")
    public String delete(int id){
        if(replyDetailServiceImpl.delete(id)>0){
            return "redirect:/list.html";
        }
        return "list";
    }
}
