package com.example.entity.demo.repository;

import com.example.entity.demo.model.Module;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*", methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.GET }  )
@RepositoryRestController
public interface ModuleRepository extends CrudRepository<Module, Long> {
    List<Module> findByName (@Param(value = "module_name") String module_name);
}
