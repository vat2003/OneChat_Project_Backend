package com.project.shopapp.Service.imp;

import com.project.shopapp.Service.GroupService;
import com.project.shopapp.entity.Group;
import com.project.shopapp.repository.GroupDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupImlp implements GroupService {

    @Autowired
    GroupDAO groupDAO;

    @Override
    public Group createChatGroup(Group group) {
        return groupDAO.save(group);
    }


    @Override
    public Group updateChatGroup(Group group, Long groupId) {
        Group groupUpdate = groupDAO.findById(groupId).orElse(null);
        return groupDAO.save(groupUpdate);
    }

    @Override
    public Group getGroupById(Long groupId) {
        return groupDAO.findById(groupId).orElse(null);
    }

    @Override
    public void deleteGroup(Long groupId) {
        groupDAO.deleteById(groupId);
    }


}
