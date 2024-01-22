package com.microservice.schoolservice.Controller;

import com.microservice.schoolservice.Entity.School;
import com.microservice.schoolservice.Service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchool(){
       return schoolService.getAllSchool();
    }
    @GetMapping("/{id}")
    public School getSchoolBySchoolId(@PathVariable Long id){
        return schoolService.getSchoolBySchoolId(id);
    }
    @PostMapping
    public School createSchool(@RequestBody School school){
        return schoolService.createSchool(school);
    }
}
