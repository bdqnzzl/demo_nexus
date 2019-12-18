package service;

import pojo.ReplyDetail;

import java.util.List;

public interface ReplyDetailService {
    public List<ReplyDetail> getReplyDetailList(int id, int pageSize, int currentPage);

    public int add(ReplyDetail replyDetail);

    public int delete(int id);

    public int getReplyDetailCount(int id);
}
