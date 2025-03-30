package com.java.smart.school.Request;

import com.java.smart.school.Domain.LocationDepartment;
import com.java.smart.school.Response.AddressResponse;

import java.util.List;

public class LocationRequest {

    private String locationName;

    private AddressResponse addressResponse;

    private int yearAdded;

    private String headOfLocation;

    private List<LocationDepartment> departments;

    public LocationRequest(int yearAdded, String locationName, AddressResponse addressResponse, String headOfLocation, List<LocationDepartment> departments) {
        this.yearAdded = yearAdded;
        this.locationName = locationName;
        this.addressResponse = addressResponse;
        this.headOfLocation = headOfLocation;
        this.departments = departments;
    }

    public LocationRequest() {
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

    public List<LocationDepartment> getDepartments() {
        return departments;
    }

    public void setDepartments(List<LocationDepartment> departments) {
        this.departments = departments;
    }
}
