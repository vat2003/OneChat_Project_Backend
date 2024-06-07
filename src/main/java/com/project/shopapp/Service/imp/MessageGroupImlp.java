package com.project.shopapp.Service.imp;

import com.project.shopapp.Service.MessageGroupService;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.MessageGroup;
import com.project.shopapp.repository.MessageGroupDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageGroupImlp implements MessageGroupService {

    @Autowired
    MessageGroupDAO messageGroupDAO;

    @Override
    public List<MessageGroup> getAllMessageGroup() {
        return messageGroupDAO.findAll();
    }

    @Override
    public List<MessageGroup> getAllByGroupId(Group group) {
        return messageGroupDAO.findByReceiverGroup(group.getGroupId());
//        return null;
    }

    @Override
    public MessageGroup createMessage(MessageGroup messageGroup) {
        return messageGroupDAO.save(messageGroup);
    }

    @Override
    public MessageGroup updateMessage(MessageGroup messageGroup, Long messageGroupId) {
        MessageGroup messageGroupUpdate = messageGroupDAO.findById(messageGroupId).orElse(null);
        return messageGroupDAO.save(messageGroupUpdate);
    }

    @Override
    public void deleteMessage(String messageGroupId) {
        messageGroupDAO.deleteById(Long.valueOf(messageGroupId));
    }

    @Override
    public List<MessageGroup> getMessageGroupBySenderId(String senderId) {
        return messageGroupDAO.findBySenderId(Long.valueOf(senderId));
//        return null;
    }

}
