package service;

import dao.InvitationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.Invitation;

import java.util.List;

@Service
public class InvitationServiceImpl implements  InvitationService{
    @Autowired
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
