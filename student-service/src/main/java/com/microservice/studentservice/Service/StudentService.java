package com.microservice.studentservice.Service;

import com.microservice.studentservice.DTO.StudentResponse;
import com.microservice.studentservice.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student createStudent(Student student);
    StudentResponse getStudentById(Long studentId);
    List<Student> getAllStudent();
    String deleteStudentById(Long studentId);
}
