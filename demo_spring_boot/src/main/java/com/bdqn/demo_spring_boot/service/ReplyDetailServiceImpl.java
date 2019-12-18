package com.bdqn.demo_spring_boot.service;

import com.bdqn.demo_spring_boot.dao.ReplyDetailMapper;
import com.bdqn.demo_spring_boot.pojo.ReplyDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ReplyDetailServiceImpl implements ReplyDetailService{
    @Resource
    private ReplyDetailMapper replyDetailMapper;
    @Override
    public List<ReplyDetail> getReplyDetailList(int id, int pageSize, int currentPage) {
        int limit1 = (currentPage-1)*pageSize;
        int limit2 = pageSize;
        return replyDetailMapper.getReplyDetailList(id,limit1,limit2);
    }

    @Override
    public int add(ReplyDetail replyDetail) {
        return replyDetailMapper.add(replyDetail);
    }

    @Override
    public int delete(int id) {
        return replyDetailMapper.delete(id);
    }

    @Override
    public int getReplyDetailCount(int id){
        return replyDetailMapper.getReplyDetailCount(id);
    }
}
