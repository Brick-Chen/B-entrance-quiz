package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//TODO GTB-完成度: + 实现了查询学员 API
//TODO GTB-完成度: + 实现了添加学员 API
//TODO GTB-完成度: - 随机分组 API 没有实现
//TODO GTB-完成度: - 查询分组 API 没有实现

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

    //TODO GTB-知识点: - 这里的 URL 也要用 students，复数形式，才符合 REST
    //TODO GTB-知识点: - 可以用 @ResponseStatus 来简化代码
    @PostMapping("/student")
    public ResponseEntity addStudent(@RequestBody Student student) {
        groupService.add(student);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/group-students")
    public ResponseEntity<List<Student>> groupStudents() {
        return ResponseEntity.ok(groupService.groupStudents());
    }
}
