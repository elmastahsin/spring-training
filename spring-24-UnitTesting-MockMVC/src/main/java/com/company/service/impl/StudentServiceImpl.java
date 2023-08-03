package com.company.service.impl;

import com.company.dto.StudentDTO;
import com.company.repository.StudentRepository;
import com.company.service.StudentService;
import com.company.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final MapperUtil mapperUtil;

    public StudentServiceImpl(StudentRepository studentRepository, MapperUtil mapperUtil) {
        this.studentRepository = studentRepository;
        this.mapperUtil = mapperUtil;
    }

    public List<StudentDTO> getStudents() {
        return studentRepository.findAll().stream().map(student -> mapperUtil.convert(student, new StudentDTO())).collect(Collectors.toList());
    }

}
