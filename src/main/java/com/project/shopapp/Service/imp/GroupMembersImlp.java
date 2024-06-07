package com.project.shopapp.Service.imp;

import com.project.shopapp.Service.GroupMembersService;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import com.project.shopapp.entity.User;
import com.project.shopapp.repository.GroupMembersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupMembersImlp implements GroupMembersService {
    @Autowired
    GroupMembersDAO groupMembersDAO;

    @Override
    public GroupMember addGroupMember(GroupMember groupMember) {
        return groupMembersDAO.save(groupMember);
    }

    @Override
    public List<GroupMember> getAllGroupByMember(Long member) {
        return groupMembersDAO.findGroupMembersByUserId(member);

//        return null;
    }

    @Override
    public void outGroup(Group group, User user) {
        groupMembersDAO.deleteGroupMemberByGroupIdAndUserId(group.getGroupId(), user.getUser_id());

    }

}
