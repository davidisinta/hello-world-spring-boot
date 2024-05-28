package com.helloworld.springboot.hello_world_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController
{
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()
    {
        return Arrays.asList(
                new Course(1, "Learn GCP", "in28mins"),
                new Course(2, "Learn AWS", "java yute"),
                new Course(3, "Learn Azure", "java yute"),
                new Course(4, "Learn Java", "boyy boyy"),
                new Course(5, "Grokking Javascript", "Dave"),
                new Course(6, "Learn Rapping", "Remy like Papouss"),
                new Course(7,"Learn ball", "Roro"),
                new Course(8,"Learn goat stuff", "Messi"),
                new Course(9,"Learn bottling", "Arteta"),
                new Course(10,"Learn to defeat pep", "Ten Hag"),
                new Course(10,"Learn to defeat all opps", "Ten Hag")

        );

    }

}
