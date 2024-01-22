package com.microservice.schoolservice.Service;

import com.microservice.schoolservice.Entity.School;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SchoolService {
    public School createSchool(School school);
    public List<School> getAllSchool();
    public School getSchoolBySchoolId(Long schoolId);
}
