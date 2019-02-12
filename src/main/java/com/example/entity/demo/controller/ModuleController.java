package com.example.entity.demo.controller;

import com.example.entity.demo.model.Module;
import com.example.entity.demo.model.Student;
import com.example.entity.demo.repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/module")
public class ModuleController {

    @Autowired
    private ModuleRepository moduleRepository;

    @GetMapping("/all")
    public @ResponseBody Iterable<Module> getAllModules()
    {
        return moduleRepository.findAll();
    }

    @PostMapping("/module")
    public ResponseEntity<Object> createModule(@RequestBody Module module)
    {
        Module savedModule = moduleRepository.save(module);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedModule.getId()).toUri();
        return ResponseEntity.created(location).build();
    }
}
