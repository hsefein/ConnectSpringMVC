package com.example.entity.demo.controller;

import com.example.entity.demo.model.Student;
import com.example.entity.demo.model.StudentModule;
import com.example.entity.demo.repository.StudentModuleRepository;
import com.example.entity.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/studentmodule")
public class StudentModuleController {

    @Autowired
    private StudentModuleRepository studentModuleRepository;

    @GetMapping("/all")
    public @ResponseBody
    Iterable<StudentModule> getAllStudentModules()
    {
        return studentModuleRepository.findAll();
    }
}
