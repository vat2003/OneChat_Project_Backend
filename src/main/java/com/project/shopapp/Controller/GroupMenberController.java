package com.project.shopapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shopapp.Service.GroupMembersService;
import com.project.shopapp.entity.Group;
import com.project.shopapp.entity.GroupMember;
import com.project.shopapp.entity.User;

@RestController
@RequestMapping("${api.prefix}/GroupMenber")
@CrossOrigin(origins = "*")
public class GroupMenberController {
    @Autowired
    GroupMembersService GroupMembersService;

    @GetMapping("")
    public ResponseEntity<?> findAllGroupByUser() {
        try {

            return ResponseEntity.ok(GroupMembersService.getAllGroupMember());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(null);
        }
    }

    @GetMapping("/groups/{userId}")
    public ResponseEntity<List<Group>> findGroupsByUserId(@PathVariable Long userId) {
        try {
            List<Group> groups = GroupMembersService.findGroupsByUserIdL(userId);
            return ResponseEntity.ok(groups);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @GetMapping("/users/{groupId}")
    public ResponseEntity<List<User>> findUsersByGroupId(@PathVariable Long groupId) {
        try {
            List<User> users = GroupMembersService.findUsersByGroupId(groupId);
            return ResponseEntity.ok(users);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

}
