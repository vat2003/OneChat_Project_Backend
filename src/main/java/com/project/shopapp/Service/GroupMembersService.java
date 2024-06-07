package com.project.shopapp.Service;

import com.project.shopapp.DTO.GroupMemberDTO;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import com.project.shopapp.entity.User;

import java.util.List;

public interface GroupMembersService {
    List<GroupMember> getAllGroupMember();

    List<Group> findGroupsByUserIdL(Long userId);

    List<User> findUsersByGroupId(Long groupId);

}
