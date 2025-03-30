package com.java.smart.school.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String locationName;

    private int addressId;

    private int yearAdded;

    private String headOfLocation;

    private int noOfDepartments;

    private int noOfTeachers;

    private int noOfStudents;

    public Location(String locationName, int addressId, int yearAdded, String headOfLocation, int noOfDepartments, int noOfTeachers, int noOfStudents) {
        this.locationName = locationName;
        this.addressId = addressId;
        this.yearAdded = yearAdded;
        this.headOfLocation = headOfLocation;
        this.noOfDepartments = noOfDepartments;
        this.noOfTeachers = noOfTeachers;
        this.noOfStudents = noOfStudents;
    }

    public Location() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getYearAdded() {
        return yearAdded;
    }

    public void setYearAdded(int yearAdded) {
        this.yearAdded = yearAdded;
    }

    public String getHeadOfLocation() {
        return headOfLocation;
    }

    public void setHeadOfLocation(String headOfLocation) {
        this.headOfLocation = headOfLocation;
    }

    public int getNoOfDepartments() {
        return noOfDepartments;
    }

    public void setNoOfDepartments(int noOfDepartments) {
        this.noOfDepartments = noOfDepartments;
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
