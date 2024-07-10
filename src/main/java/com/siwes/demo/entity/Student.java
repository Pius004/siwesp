package com.siwes.demo.entity;

import jakarta.persistence.*;

@Entity (name = "Student")
@Table(
        name="student", schema = "myschema",
        uniqueConstraints = {@UniqueConstraint(name="student_matric_unique", columnNames = "matric")}
)
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name= "id",
            updatable = false
    )
    private Long id;

    @Column(
            name="Matric Number",
            nullable = false,
            unique = true

    )
    private Long matric;

    @Column(
            name="Full Name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name="Gender",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private Gender gender;

    @Column(
            name="Age",
            nullable = false

    )
    private int age;

    @Column(
            name="Department",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String department;

    @Column(
            name="Level",
            nullable = false

    )
    private Long level;


    public Student() {
    }

    public Student( Long matric, String name, Gender gender, int age, String department, Long level) {

        this.matric = matric;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.department = department;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMatric() {
        return matric;
    }

    public void setMatric(Long matric) {
        this.matric = matric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }
}
