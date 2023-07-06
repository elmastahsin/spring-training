package com.company.controller;

import com.company.dto.AddressDTO;
import com.company.dto.ResponseWrapper;
import com.company.dto.TeacherDTO;
import com.company.service.AddressService;
import com.company.service.TeacherService;
import com.company.service.ParentService;
import com.company.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController

public class SchoolController {

    private final TeacherService teacherService;
    private final StudentService studentService;
    private final ParentService parentService;
    private final AddressService addressService;

    public SchoolController(TeacherService teacherService, StudentService studentService, ParentService parentService, AddressService addressService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
        this.parentService = parentService;
        this.addressService = addressService;
    }


    @GetMapping("/teacher")
    public List<TeacherDTO> readAllTeacher() {

        return teacherService.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents() {

        return ResponseEntity.ok(new ResponseWrapper("students successfully retrieved", studentService.findAll()));
    }

    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper> readAllParents() {

        return ResponseEntity.status(HttpStatus.OK).body(new ResponseWrapper(true, "parents successfully retrieved", HttpStatus.OK.value(), parentService.findAll()));

    }

    @GetMapping("/address/{id}")
    public ResponseEntity<ResponseWrapper> getAddressById(@PathVariable("id") Long id) throws Exception {

        AddressDTO addressDTO = addressService.findById(id);
        return ResponseEntity.ok(new ResponseWrapper("Address successfully retrieved", addressDTO));

    }

    @PutMapping("/address/{id}")
    public AddressDTO updateAddress(@PathVariable("id") Long id, @RequestBody AddressDTO addressDTO) throws Exception {
        addressDTO.setId(id);
        return addressService.update(addressDTO);
    }

}
