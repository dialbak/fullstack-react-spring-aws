package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getAllStudents() {
        return Arrays.asList(
                new Student(1L, "Jamila", "jamila@gmail.com", Gender.FEMALE),
                new Student(2L, "Alex", "Alex@gmail.com", Gender.MALE),
                new Student(3L, "Bak", "Bak@gmail.com", Gender.MALE),
                new Student(4L, "Jamila", "jamila@gmail.com", Gender.FEMALE),
                new Student(5L, "Alex", "Alex@gmail.com", Gender.MALE),
                new Student(6L, "Bak", "Bak@gmail.com", Gender.MALE),
                new Student(7L, "Jamila", "jamila@gmail.com", Gender.FEMALE),
                new Student(8L, "Alex", "Alex@gmail.com", Gender.MALE),
                new Student(9L, "Bak", "Bak@gmail.com", Gender.MALE)
        );
    }
}
