package com.project.shopapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shopapp.entity.Friend;
import com.project.shopapp.entity.FriendRequest;
import com.project.shopapp.entity.MessageSolo;

public interface FriendRequestDao extends JpaRepository<FriendRequest, Long> {

}
