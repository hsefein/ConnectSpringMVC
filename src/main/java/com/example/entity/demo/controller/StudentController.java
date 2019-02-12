package com.example.entity.demo.controller;

import com.example.entity.demo.model.Module;
import com.example.entity.demo.model.Student;
import com.example.entity.demo.repository.ModuleRepository;
import com.example.entity.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Stack;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

//    @GetMapping("/dateofbirth")
//    public @ResponseBody
//    Iterable<Student> getAllStudentByDateOfBirth()
//    {
//        return studentRepository.findByDateOfBirth();
//    }
}
