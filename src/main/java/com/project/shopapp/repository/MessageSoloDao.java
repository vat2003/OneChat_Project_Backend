package com.project.shopapp.repository;

import com.project.shopapp.entity.MessageSolo;
import com.project.shopapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * MessageSoloDao
 */
public interface MessageSoloDao extends JpaRepository<MessageSolo, Long> {

}