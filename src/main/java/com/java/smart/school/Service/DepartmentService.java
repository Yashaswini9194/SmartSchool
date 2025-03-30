package com.java.smart.school.Service;

import com.java.smart.school.Domain.Department;
import com.java.smart.school.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public long getNumberofDepartments(){
        return departmentRepository.getNumberOfDepartments();
    }

    public long getNumberOfTeachers(){
        return departmentRepository.getNumberOfTeachers();
    }

    public long getNumberOfStudents(){
        return departmentRepository.getNumberOfStudents();
    }

    public List<Department> getAllDepartments(){
        return departmentRepository.getAllDepartments();
    }

    public Department getDepartmentByAbbreviation (String abbreviation){
        return departmentRepository.getDepartmentByAbbreviation(abbreviation);
    }

    public void createDepartment(Department department){
        departmentRepository.createDepartment(department);
    }

    public void deleteDepartment(String abbreviation){
        departmentRepository.deleteDepartment(abbreviation);
    }
}
