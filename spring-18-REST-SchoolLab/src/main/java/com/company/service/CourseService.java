package com.company.service;

import com.company.dto.CourseDTO;

import java.util.List;

public interface CourseService {

    List<CourseDTO> findAll();

    CourseDTO findById(Long id) throws Exception;

}