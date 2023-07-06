package com.company.controller;

import com.company.dto.ResponseWrapper;
import com.company.dto.TeacherDTO;
import com.company.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController

public class SchoolController {

    private final TeacherService teacherService;

    public SchoolController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }


    @GetMapping("/teacher")
    public List<TeacherDTO> readAllTeacher(){

        return teacherService.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents(){

        return ResponseEntity.ok(new ResponseWrapper("students successfully retrieved", teacherService.findAll()));
    }

}
