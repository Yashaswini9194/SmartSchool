package com.java.smart.school.Controller;

import com.java.smart.school.Response.SchoolInformationResponse;
import com.java.smart.school.Service.SchoolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class SchoolController {

    private final SchoolService schoolService;

    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping("/information")
    public ResponseEntity<SchoolInformationResponse> getSchoolInformation(){
        SchoolInformationResponse schoolInformationResponse = schoolService.getSchoolInformation();
        return ResponseEntity.ok(schoolInformationResponse);
    }
}
