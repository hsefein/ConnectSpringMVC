package com.example.entity.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Module")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Module {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Module_Id")
    private Long id;

    @Column(name = "Name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "module", fetch = FetchType.LAZY)
    private List<StudentModule> studentModules;

    public Module() { }

    public Module(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Module{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public List<StudentModule> getStudentModules() {
        return studentModules;
    }

    public void setStudentModules(List<StudentModule> studentModules) {
        this.studentModules = studentModules;
    }
}
