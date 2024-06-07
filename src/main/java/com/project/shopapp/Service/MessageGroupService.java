package com.project.shopapp.Service;

import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.MessageGroup;

import java.util.List;

public interface MessageGroupService {

    List<MessageGroup> getAllMessageGroup();
    List<MessageGroup> getAllByGroupId(Group group);

    MessageGroup createMessage(MessageGroup messageGroup);

    MessageGroup updateMessage(MessageGroup messageGroup, Long messageGroupId);

    void deleteMessage(String messageGroupId);

    List<MessageGroup> getMessageGroupBySenderId(String senderId);
}
