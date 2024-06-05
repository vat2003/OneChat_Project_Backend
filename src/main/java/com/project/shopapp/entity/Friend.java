package com.project.shopapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import lombok.Data;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "friends")
@IdClass(FriendId.class)
public class Friend {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id1", nullable = false)
    private User user1;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id2", nullable = false)
    private User user2;

}