package com.java.smart.school.Response;

public class SchoolInformationResponse {
    private final String schoolName = "Smart School";

    private final String founderName = "Yashaswini";

    private final int yearFounded = 2003;

    private AddressResponse addressResponse;

    private int noOfDepartment;

    private int noOfTeachers;

    private int noOfStudents;

    public SchoolInformationResponse(AddressResponse addressResponse, int noOfDepartment, int noOfTeachers, int noOfStudents) {
        this.addressResponse = addressResponse;
        this.noOfDepartment = noOfDepartment;
        this.noOfTeachers = noOfTeachers;
        this.noOfStudents = noOfStudents;
    }

    public SchoolInformationResponse() {
    }

    public AddressResponse getAddressResponse() {
        return addressResponse;
    }

    public void setAddressResponse(AddressResponse addressResponse) {
        this.addressResponse = addressResponse;
    }

    public int getNoOfDepartment() {
        return noOfDepartment;
    }

    public void setNoOfDepartment(int noOfDepartment) {
        this.noOfDepartment = noOfDepartment;
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

    public String getSchoolName() {
        return schoolName;
    }

    public String getFounderName() {
        return founderName;
    }

    public int getYearFounded() {
        return yearFounded;
    }
}
