package com.project.shopapp.Service;

import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import com.project.shopapp.entity.User;

import java.util.List;

public interface GroupMembersService {
    GroupMember addGroupMember(GroupMember groupMember);
    List<GroupMember> getAllGroupByMember(Long member);

    void outGroup(Group group, User user);

}
