package com.project.shopapp.Service;

import com.project.shopapp.entity.Group;

public interface GroupService {
    Group createChatGroup(Group group);
    Group updateChatGroup(Group group, Long groupId);
    Group getGroupById(Long groupId);
    void deleteGroup(Long groupId);
}
