package com.bdqn.demo_spring_boot.service;
import com.bdqn.demo_spring_boot.pojo.Invitation;

import java.util.List;
public interface InvitationService {
    public List<Invitation> getInvitationList(
            String title, int pageSize, int currentPage);

    public int delete(int id);

    public int getInvitationCount(String title);
}
