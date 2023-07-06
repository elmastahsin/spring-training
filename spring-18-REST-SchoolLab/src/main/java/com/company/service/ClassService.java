package com.company.service;

import com.company.dto.ClassDTO;

import java.util.List;

public interface ClassService {

    List<ClassDTO> findAll();

    ClassDTO findById(Long id) throws Exception;

}