package com.company.service;

import com.company.dto.MovieCinemaDTO;

import java.util.List;

public interface MovieCinemaService {

    List<MovieCinemaDTO> findAll();
    MovieCinemaDTO findById(Long id);

}
