package com.project.shopapp.repository;

import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import com.project.shopapp.entity.User;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupDAO extends JpaRepository<Group, Long> {
    List<Group> findByGroupName(String groupName);

    Group findByGroupId(Long groupId);

}
