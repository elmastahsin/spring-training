package com.company.service;

import com.company.dto.GenreDTO;

public interface GenreService {

    GenreDTO save(GenreDTO genreDTO);
    void deleteById(Long id);

}
