package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(groupService.getAllStudents());
    }

    @PostMapping("/student")
    public ResponseEntity addStudent(@RequestBody Student student) {
        groupService.add(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/group-students")
    public ResponseEntity<List<List<Student>>> groupStudents() {
        return ResponseEntity.ok(groupService.groupStudents());
    }
}
