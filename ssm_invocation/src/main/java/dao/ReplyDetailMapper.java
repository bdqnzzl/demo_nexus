package dao;
import org.apache.ibatis.annotations.Param;
import pojo.ReplyDetail;

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
