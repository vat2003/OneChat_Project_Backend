package com.project.shopapp.repository;

import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupDAO extends JpaRepository<Group, Long> {

}
