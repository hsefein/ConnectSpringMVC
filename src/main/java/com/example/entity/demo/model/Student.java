package com.example.entity.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Student_Id")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "DateOfBirth")
    private Date DateOfBirth;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<StudentModule> studentModules;
    public Student() { }

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        DateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                '}';
    }

    public List<StudentModule> getStudentModules() {
        return studentModules;
    }

    public void setStudentModules(List<StudentModule> studentModules) {
        this.studentModules = studentModules;
    }
}
