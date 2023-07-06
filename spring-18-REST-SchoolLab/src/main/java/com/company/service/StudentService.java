package com.company.service;

import com.company.dto.StudentDTO;

import java.util.List;

public interface StudentService {

    List<StudentDTO> findAll();

    StudentDTO findById(Long id) throws Exception;

}