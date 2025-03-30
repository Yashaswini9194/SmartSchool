package com.java.smart.school.Service;

import com.java.smart.school.Domain.Address;
import com.java.smart.school.Repository.AddressRepository;
import com.java.smart.school.Repository.DepartmentRepository;
import com.java.smart.school.Response.AddressResponse;
import com.java.smart.school.Response.SchoolInformationResponse;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {

    private final AddressRepository addressRepository;
    private final DepartmentRepository departmentRepository;

    public SchoolService(AddressRepository addressRepository, DepartmentRepository departmentRepository) {
        this.addressRepository = addressRepository;
        this.departmentRepository = departmentRepository;
    }

    public SchoolInformationResponse getSchoolInformation(){
        SchoolInformationResponse schoolInformationResponse = new SchoolInformationResponse();
        Address address = addressRepository.getAddressById(1);
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setStreet(address.getStreet());
        addressResponse.setCity(address.getCity());
        addressResponse.setState(address.getState());
        addressResponse.setCountry(address.getCountry());
        addressResponse.setZipCode(address.getZipCode());
        schoolInformationResponse.setAddressResponse(addressResponse);
        long departmentCount = departmentRepository.getNumberOfDepartments();
        schoolInformationResponse.setNoOfDepartment((int) departmentCount);
        long teacherCount = departmentRepository.getNumberOfTeachers();
        schoolInformationResponse.setNoOfTeachers((int) teacherCount);
        long studentCount = departmentRepository.getNumberOfStudents();
        schoolInformationResponse.setNoOfStudents((int) studentCount);
        return schoolInformationResponse;
    }
}
