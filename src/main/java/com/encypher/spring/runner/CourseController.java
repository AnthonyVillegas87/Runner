package com.encypher.spring.runner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveCourses() {
        return Arrays.asList(

               new Course(1, "English", "Heimer"),
                new Course(2, "Math", "Bradberry")


        );
    }

}
