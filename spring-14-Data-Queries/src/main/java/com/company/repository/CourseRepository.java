package com.company.repository;

import com.company.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course, Long> {

    //Find all courses with by category select * from courses where category = ?
    List<Course> findByCategory(String category);

    //Find all courses by category and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //Check if a course with the supplied name exists. return ture if exists, false otherwise
    boolean existsByName(String name);

    //return the number of courses for the given category
    int countByCategory(String category);

    //find all the courses taht start with the given course name string
    List<Course> findByNameStartingWith(String name);

    // Find all courses by category and return a stream
    Stream<Course> streamAllByCategory(String category);

    @Query("SELECT c FROM Course c WHERE c.category = :category AND c.rating > :rating")
    List<Course> retrieveAllByCategoryAndRatingGreater(@Param("category") String category, @Param("rating") double rating);

}
