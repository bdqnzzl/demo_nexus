package com.bdqn.demo_spring_boot.dao;
import com.bdqn.demo_spring_boot.pojo.ReplyDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReplyDetailMapper {
    public List<ReplyDetail> getReplyDetailList(
            @Param("id") int id,
            @Param("limit1") int limit1,
            @Param("limit2") int limit2);

    public int delete(int id);

    public int getReplyDetailCount(
            @Param("id") int id);

    public int add(ReplyDetail replyDetail);
}
