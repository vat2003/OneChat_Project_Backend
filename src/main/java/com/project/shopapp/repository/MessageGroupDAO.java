package com.project.shopapp.repository;

import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.MessageGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageGroupDAO extends JpaRepository<MessageGroup, Long> {
    @Query("SELECT mg FROM MessageGroup mg WHERE mg.sender.id = :senderId")
    List<MessageGroup> findBySenderId(@Param("senderId") Long senderId);

    @Query("SELECT mg FROM MessageGroup mg WHERE mg.receiverGroup.id = :groupId")
    List<MessageGroup> findByReceiverGroup(@Param("groupId") Long groupId);
}
