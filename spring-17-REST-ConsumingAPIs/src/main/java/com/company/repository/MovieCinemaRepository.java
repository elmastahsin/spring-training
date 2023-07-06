package com.company.repository;

import com.company.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {
}
