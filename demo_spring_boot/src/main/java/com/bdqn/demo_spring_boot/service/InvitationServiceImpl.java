package com.bdqn.demo_spring_boot.service;

import com.bdqn.demo_spring_boot.dao.InvitationMapper;
import com.bdqn.demo_spring_boot.pojo.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InvitationServiceImpl implements  InvitationService{
    @Resource
    private InvitationMapper invitationMapper;
    @Override
    public List<Invitation> getInvitationList(String title, int pageSize, int currentPage) {
        int limit1 = (currentPage-1)*pageSize;
        int limit2 = pageSize;
        return invitationMapper.getInvitationList(title, limit1, limit2);
    }

    @Override
    public int delete(int id) {
        return invitationMapper.delete(id);
    }

    @Override
    public int getInvitationCount(String title) {
        return invitationMapper.getInvitationCount(title);
    }
}
