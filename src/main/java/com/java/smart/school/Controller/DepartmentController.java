package com.java.smart.school.Controller;

import com.java.smart.school.Domain.Department;
import com.java.smart.school.Service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/Count")
    public long getNumberOfDepartments(){
        return departmentService.getNumberofDepartments();
    }

    @GetMapping("/teacherCount")
    public long getNumberOfTeachers(){
        return departmentService.getNumberOfTeachers();
    }

    @GetMapping("/studentCount")
    public long getNumberOfStudents(){
        return departmentService.getNumberOfStudents();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Department>> getAllDepartments(){
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    @GetMapping("/byAbbreviation/{abbreviation}")
    public ResponseEntity<Department> getDepartmentByAbbreviation(@PathVariable("abbreviation") String abbreviation){
        return ResponseEntity.ok(departmentService.getDepartmentByAbbreviation(abbreviation));
    }

    @PostMapping("/create")
    public void createDepartment(@RequestBody Department department){
        departmentService.createDepartment(department);
    }

    @DeleteMapping("/delete/{abbreviation}")
    public void deleteDepartment(@PathVariable("abbreviation") String abbreviation){
        departmentService.deleteDepartment(abbreviation);
    }
}
