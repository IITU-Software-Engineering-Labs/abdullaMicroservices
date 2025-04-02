package com.abdullah.microservices.student_service.controller;

import com.abdullah.microservices.student_service.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private static List<Student> students = Arrays.asList(
            new Student(1, "Alice", "Computer Science", "Coffee"),
            new Student(2, "Bob", "Mechanical Engineering", "Tea")
    );

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @GetMapping("/by-hobby/{hobby}")
    public String getStudentByHobby(@PathVariable String hobby) {
        return "Students who love " + hobby + " are cool!";
    }
}
