package com.project.shopapp.Service;

import java.util.List;

import com.project.shopapp.DTO.GroupDTO;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.User;

public interface GroupService {

    Group createChatGroupDTo(GroupDTO GroupDTO);

    Group updateChatGroup(GroupDTO GroupDTO, Long groupId);

    Group getGroupById(Long groupId);

    List<Group> getAll();

    void deleteGroup(Long groupId);

    List<Group> getGroupsByName(String name);

}
