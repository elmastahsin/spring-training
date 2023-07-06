package com.company.service;

import com.company.dto.ParentDTO;

import java.util.List;

public interface ParentService {

    List<ParentDTO> findAll();

    ParentDTO findById(Long id) throws Exception;

}