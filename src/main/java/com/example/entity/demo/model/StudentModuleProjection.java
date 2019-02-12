package com.example.entity.demo.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="detail", types = StudentModule.class)
public interface StudentModuleProjection {
    StudentDetailProjection getStudent();
    ModuleDetailProjection getModule();
}
