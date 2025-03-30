package com.java.smart.school.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String departmentName;

    @Column(unique = true)
    private String abbreviation;

    private int yearAdded;

    private String headOfDepartment;

    private int noOfTeachers;

    private int noOfStudents;

    public Department(String departmentName, String abbreviation, int yearAdded, String headOfDepartment, int noOfTeachers, int noOfStudents) {
        this.departmentName = departmentName;
        this.abbreviation = abbreviation;
        this.yearAdded = yearAdded;
        this.headOfDepartment = headOfDepartment;
        this.noOfTeachers = noOfTeachers;
        this.noOfStudents = noOfStudents;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getYearAdded() {
        return yearAdded;
    }

    public void setYearAdded(int yearAdded) {
        this.yearAdded = yearAdded;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public int getNoOfTeachers() {
        return noOfTeachers;
    }

    public void setNoOfTeachers(int noOfTeachers) {
        this.noOfTeachers = noOfTeachers;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }
}
