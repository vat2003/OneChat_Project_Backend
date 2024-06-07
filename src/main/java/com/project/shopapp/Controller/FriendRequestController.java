package com.project.shopapp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shopapp.Service.FriendRequestService;
import com.project.shopapp.entity.FriendRequest;
import com.project.shopapp.entity.MessageSolo;

@RestController
@RequestMapping("${api.prefix}/friendrequest")
@CrossOrigin(origins = "*")
public class FriendRequestController {
    @Autowired
    FriendRequestService FRservice;

    @PostMapping("/addrequest")
    public ResponseEntity<?> addfriendrequest(@RequestBody FriendRequest friendRequest) {
        try {
            FriendRequest friendRequesttemp = FRservice.createFriendRequest(friendRequest);
            System.out.println(friendRequest);
            return ResponseEntity.ok(friendRequesttemp);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());

        }
    }

}
