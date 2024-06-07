package com.project.shopapp.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.shopapp.DTO.LoginResponse;
import com.project.shopapp.DTO.UserLoginDTO;
import com.project.shopapp.Service.MessageSoloService;
import com.project.shopapp.Service.UserService;
import com.project.shopapp.entity.MessageSolo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("${api.prefix}/messagesolo")
@CrossOrigin(origins = "*")
public class MessageController {
    @Autowired
    MessageSoloService messageSoloService;

    @PostMapping("/add")
    public ResponseEntity<?> addmessagesolo(@RequestBody MessageSolo messageSolo) {
        try {
            MessageSolo messtemp = messageSoloService.createMessageSolo(messageSolo);
            System.out.println(messageSolo);
            return ResponseEntity.ok(messtemp);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());

        }
    }

}
