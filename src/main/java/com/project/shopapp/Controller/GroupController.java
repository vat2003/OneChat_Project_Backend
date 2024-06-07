package com.project.shopapp.Controller;

import com.project.shopapp.DTO.GroupDTO;
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
import java.util.Map;

@RestController
@RequestMapping("${api.prefix}/group")
@CrossOrigin(origins = "*")
public class GroupController {
    @Autowired
    GroupService groupService;

    @Autowired
    UserService userService;

    @GetMapping("")
    public ResponseEntity<?> findAllGroupByUser() {
        try {

            return ResponseEntity.ok(groupService.getAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.ok(null);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Group> findGroupById(@PathVariable Long id) {
        try {
            Group group = groupService.getGroupById(id);
            if (group != null) {
                return ResponseEntity.ok(group);
            } else {
                return ResponseEntity.status(404).body(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @PostMapping("")
    public ResponseEntity<Group> createGroup(@RequestBody GroupDTO GroupDTO) {
        try {
            // Group createdGroup = groupService.createChatGroup(group);
            Group createdGroup = groupService.createChatGroupDTo(GroupDTO);
            return ResponseEntity.ok(createdGroup);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Group> updateGroup(@PathVariable Long id, @RequestBody GroupDTO GroupDTO) {
        try {
            Group updatedGroup = groupService.updateChatGroup(GroupDTO, id);
            return ResponseEntity.ok(updatedGroup);

        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteGroup(@PathVariable Long id) {
        try {
            groupService.deleteGroup(id);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).build();
        }
    }

    @GetMapping("/search")
    public ResponseEntity<List<Group>> findGroupsByName(@RequestBody Map<String, String> requestBody) {
        try {
            String name = requestBody.get("name");
            List<Group> groups = groupService.getGroupsByName(name);
            return ResponseEntity.ok(groups);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

}
