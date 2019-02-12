package com.example.entity.demo.model;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "detail", types = {Student.class})
public interface StudentDetailProjection {
    Long getId();
    String getName();
    List<StudentModule> getStudentModules();
}
