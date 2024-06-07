package com.project.shopapp.Controller;

import com.project.shopapp.Service.GroupMembersService;
import com.project.shopapp.Service.GroupService;
import com.project.shopapp.Service.UserService;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import com.project.shopapp.entity.GroupMemberId;
import com.project.shopapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/group")
@CrossOrigin(origins = "*")
public class GroupController {
    @Autowired
    GroupService groupService;
    @Autowired
    GroupMembersService groupMembersService;
    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<?> findAllGroupByUser(@RequestBody Long userId) {
        try {
            List<GroupMember> u = groupMembersService.getAllGroupByMember(userId);
            return ResponseEntity.ok(u);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(null);
        }
    }




}
