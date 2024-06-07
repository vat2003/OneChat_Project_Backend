package com.project.shopapp.Service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shopapp.Service.FriendRequestService;
import com.project.shopapp.entity.FriendRequest;
import com.project.shopapp.repository.FriendRequestDao;

@Service
public class FriendRequestServiceImlp implements FriendRequestService {
    @Autowired
    FriendRequestDao FRdao;

    @Override
    public FriendRequest createFriendRequest(FriendRequest frrquest) {
        FriendRequest frRq = new FriendRequest();
        frRq.setReceiver(frrquest.getReceiver());
        frRq.setRequestId(frrquest.getRequestId());
        frRq.setSender(frrquest.getSender());
        frRq.setStatus(frrquest.getStatus());

        return FRdao.save(frRq);
    }

    @Override
    public void deleteFriendRequest(Long frrquest_id) {
        FRdao.deleteById(frrquest_id);
    }

}
