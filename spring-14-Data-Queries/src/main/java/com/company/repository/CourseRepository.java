package com.company.repository;

import com.company.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

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


}
