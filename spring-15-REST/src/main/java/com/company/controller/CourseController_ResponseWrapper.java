package com.company.controller;

import com.company.dto.CourseDTO;
import com.company.dto.ResponseWrapper;
import com.company.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses/api/v3")
public class CourseController_ResponseWrapper {

    private final CourseService courseService;

    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getAllCourses() {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "v3")
                .body(new ResponseWrapper("Successfully retrieved", courseService.getCourses()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable ("id") long courseId) {
        return ResponseEntity
                .ok(new ResponseWrapper("course: "+ courseId + " retrieved", courseService.getCourseById(courseId)));

    }

//    @DeleteMapping("{id}")
//    public ResponseEntity<ResponseWrapper> deleteCourseById(@PathVariable("id") long courseId) {
//        courseService.deleteCourseById(courseId);
//        return ResponseEntity
//                .status(HttpStatus.NO_CONTENT)
//                .header("Operation", "Delete")
//                .body(new ResponseWrapper("Successfully deleted"));
//    }


}
