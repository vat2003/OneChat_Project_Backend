package com.project.shopapp.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

@Data
public class GroupMemberId implements Serializable {
    private Long group;
    private Long user;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupMemberId that = (GroupMemberId) o;
        return Objects.equals(group, that.group) && Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group, user);
    }

}