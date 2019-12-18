package com.bdqn.demo_spring_boot.service;

import com.bdqn.demo_spring_boot.pojo.ReplyDetail;

import java.util.List;

public interface ReplyDetailService {
    public List<ReplyDetail> getReplyDetailList(int id, int pageSize, int currentPage);

    public int add(ReplyDetail replyDetail);

    public int delete(int id);

    public int getReplyDetailCount(int id);
}
