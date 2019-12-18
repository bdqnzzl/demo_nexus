package dao;
import org.apache.ibatis.annotations.Param;
import pojo.Invitation;

import java.util.List;

public interface InvitationMapper {
    public List<Invitation> getInvitationList(
            @Param("title") String title,
            @Param("limit1") int limit1,
            @Param("limit2") int limit2);

    public int delete(int id);

    public int getInvitationCount(
            @Param("title") String title);
}
