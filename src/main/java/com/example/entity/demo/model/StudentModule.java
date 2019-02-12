package com.example.entity.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "StudentModule")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class StudentModule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "StudentModule_Id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Module_Id", foreignKey = @ForeignKey(name = "Module_Id_FK"))
    private Module module;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Student_Id", foreignKey = @ForeignKey(name = "Student_Id_FK"))
    private Student student;

    public StudentModule() { }

    public StudentModule(Module module, Student student) {
        this.module = module;
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudentModule{" +
                "id=" + id +
                ", module=" + module +
                ", student=" + student +
                '}';
    }
}
