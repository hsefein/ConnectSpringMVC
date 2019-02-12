package com.example.entity.demo.repository;

import com.example.entity.demo.model.Module;
import com.example.entity.demo.model.Student;
import com.example.entity.demo.model.StudentModule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*", methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.GET }  )
@RepositoryRestResource
public interface StudentModuleRepository extends CrudRepository<StudentModule, Long> {

    List<StudentModule> findByStudentId (@Param(value = "student_id") Long student_id);
    List<StudentModule> findByModuleId (@Param(value = "module_id") Long module_id);

}
