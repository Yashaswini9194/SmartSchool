package com.java.smart.school.Domain;

public class LocationDepartment {

    private String department;

    private int noOfTeachers;

    private int noOfStudents;

    public LocationDepartment(String department, int noOfTeachers, int noOfStudents) {
        this.department = department;
        this.noOfTeachers = noOfTeachers;
        this.noOfStudents = noOfStudents;
    }

    public LocationDepartment() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
