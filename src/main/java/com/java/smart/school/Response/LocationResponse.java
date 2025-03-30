package com.java.smart.school.Response;

import java.util.List;

public class LocationResponse {

    private String locationName;

    private AddressResponse addressResponse;

    private int yearAdded;

    private String headOfLocation;

    private List<String> departments;

    private int noOfTeachers;

    private int noOfStudents;

    public LocationResponse(String locationName, AddressResponse addressResponse, int yearAdded, String headOfLocation, List<String> departments, int noOfTeachers, int noOfStudents) {
        this.locationName = locationName;
        this.addressResponse = addressResponse;
        this.yearAdded = yearAdded;
        this.headOfLocation = headOfLocation;
        this.departments = departments;
        this.noOfTeachers = noOfTeachers;
        this.noOfStudents = noOfStudents;
    }

    public LocationResponse() {
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
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

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
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
