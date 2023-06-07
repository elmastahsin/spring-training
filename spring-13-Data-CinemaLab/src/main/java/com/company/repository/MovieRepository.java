package com.company.repository;

import com.company.entity.Movie;
import com.company.enums.MovieState;
import com.company.enums.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read a movie with a name
    Optional<Movie> findByName(String name);

    //Write a derived query to list all movies between a range of prices
    List<Movie> findAllByPriceBetween(BigDecimal price1, BigDecimal price2);

    //Write a derived query to list all movies where duration exists in the specific list of duration


    //Write a derived query to list all movies with higher than a specific release date


    //Write a derived query to list all movies with a specific state and type


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movies between a range of prices



    //Write a JPQL query that returns all movie names



    // ------------------- Native QUERIES ------------------- //

    //Write a native query that returns a movie by name



    //Write a native query that return the list of movies in a specific range of prices



    //Write a native query to return all movies where duration exists in the range of duration



    //Write a native query to list the top 5 most expensive movies



}
