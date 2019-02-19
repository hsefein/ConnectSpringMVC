package com.example.entity.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
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
    private LocalDate DateOfBirth;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    private List<StudentModule> studentModules;
    public Student() { }

    public Student(String name, LocalDate dateOfBirth, List<StudentModule> studentModules) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.studentModules = studentModules;
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

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", studentModules=" + studentModules +
                '}';
    }

    public List<StudentModule> getStudentModules() {
        return studentModules;
    }

    public void setStudentModules(List<StudentModule> studentModules) {
        this.studentModules = studentModules;
    }
}
