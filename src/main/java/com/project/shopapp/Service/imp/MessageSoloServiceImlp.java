package com.project.shopapp.Service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shopapp.Service.MessageSoloService;
import com.project.shopapp.entity.MessageSolo;
import com.project.shopapp.repository.MessageSoloDao;

@Service
public class MessageSoloServiceImlp implements MessageSoloService {

    @Autowired
    MessageSoloDao messageSoloDao;

    @Override
    public MessageSolo createMessageSolo(MessageSolo messageSolo) {
        MessageSolo temp = new MessageSolo();
        temp.setContent(messageSolo.getContent());
        temp.setIsPending(messageSolo.getIsPending());
        temp.setIsRecalled(messageSolo.getIsRecalled());
        temp.setMessagesSoloId(messageSolo.getMessagesSoloId());
        temp.setReceiver(messageSolo.getReceiver());
        temp.setReplyToMessage(messageSolo.getReplyToMessage());
        temp.setSender(messageSolo.getSender());
        temp.setTimestamp(messageSolo.getTimestamp());
        return messageSoloDao.save(temp);
    }

}
