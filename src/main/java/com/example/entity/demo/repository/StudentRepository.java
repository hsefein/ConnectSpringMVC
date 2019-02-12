package com.example.entity.demo.repository;

import com.example.entity.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@CrossOrigin(allowedHeaders = "*", origins= "*", methods = { RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.PATCH, RequestMethod.OPTIONS, RequestMethod.GET }  )
@RepositoryRestResource
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByName (@Param(value = "student_name") String student_name);
//    List<Student> findByDateOfBirth (@Param(value = "student_dateOfBirth") Date student_dateOfBirth);

}
