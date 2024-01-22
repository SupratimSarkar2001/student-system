package com.microservice.schoolservice.Service;

import com.microservice.schoolservice.Entity.School;
import com.microservice.schoolservice.Repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{
    @Autowired
    private SchoolRepository schoolRepository;
    @Override
    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    @Override
    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    @Override
    public School getSchoolBySchoolId(Long schoolId) {
        return schoolRepository.findById(schoolId).get();
    }
}
