package com.project.shopapp.Service.imp;

import com.project.shopapp.DTO.GroupDTO;
import com.project.shopapp.Service.GroupService;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.User;
import com.project.shopapp.repository.GroupDAO;
import com.project.shopapp.repository.UserDAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupImlp implements GroupService {

    @Autowired
    GroupDAO groupDAO;

    @Autowired
    UserDAO UserDAO;

    private User findOrCreateUserByUsername(Long username) {

        User user = UserDAO.findById(username).get();
        if (user == null) {
            user = new User();
            user.setUsername(user.getUsername());
        }
        return user;
    }

    @Override
    public Group createChatGroupDTo(GroupDTO GroupDTO) {
        Group group = new Group();
        group.setGroupName(GroupDTO.getGroupName());
        User adminUser = findOrCreateUserByUsername(GroupDTO.getAdminGroup());
        group.setAdminGroup(adminUser);
        return groupDAO.save(group);
    }

    @Override
    public Group updateChatGroup(GroupDTO GroupDTO, Long groupId) {
        Optional<Group> optionalGroup = groupDAO.findById(groupId);
        if (optionalGroup.isPresent()) {
            Group group = optionalGroup.get();
            group.setGroupName(GroupDTO.getGroupName());
            User adminUser = findOrCreateUserByUsername(GroupDTO.getAdminGroup());
            group.setAdminGroup(adminUser);

            return groupDAO.save(group);
        } else {
            return null;
        }
    }

    @Override
    public Group getGroupById(Long groupId) {
        return groupDAO.findById(groupId).orElse(null);
    }

    @Override
    public void deleteGroup(Long groupId) {
        groupDAO.deleteById(groupId);
    }

    @Override
    public List<Group> getAll() {
        return groupDAO.findAll();

    }

    @Override
    public List<Group> getGroupsByName(String name) {
        return groupDAO.findByGroupName(name);
    }

}
