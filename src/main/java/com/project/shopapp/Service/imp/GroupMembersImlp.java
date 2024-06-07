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
    public List<GroupMember> getAllGroupMember() {
        return groupMembersDAO.findAll();
    }

    @Override
    public List<Group> findGroupsByUserIdL(Long userId) {
        return groupMembersDAO.findGroupsByUserId(userId);
    }

    @Override
    public List<User> findUsersByGroupId(Long groupId) {
        return groupMembersDAO.findUsersByGroupId(groupId);
    }

}
