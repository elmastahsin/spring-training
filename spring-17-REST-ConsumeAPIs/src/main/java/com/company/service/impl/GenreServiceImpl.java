package com.company.service.impl;

import com.company.dto.GenreDTO;
import com.company.entity.Genre;
import com.company.repository.GenreRepository;
import com.company.service.GenreService;
import com.company.util.MapperUtil;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;
    private final MapperUtil mapperUtil;

    public GenreServiceImpl(GenreRepository genreRepository, MapperUtil mapperUtil) {
        this.genreRepository = genreRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public GenreDTO save(GenreDTO genreDTO) {
        return mapperUtil.convert(genreRepository.save(mapperUtil.convert(genreDTO, new Genre())), new GenreDTO());
    }

    @Override
    public void deleteById(Long id) {
        Genre genre = genreRepository.findById(id).get();
        genre.setDeleted(true);
        genreRepository.save(genre);
    }

}
