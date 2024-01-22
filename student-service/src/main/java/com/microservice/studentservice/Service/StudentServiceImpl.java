package com.microservice.studentservice.Service;

import com.microservice.studentservice.DTO.School;
import com.microservice.studentservice.DTO.StudentResponse;
import com.microservice.studentservice.Entity.Student;
import com.microservice.studentservice.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public Student createStudent(Student student) {
        return  studentRepository.save(student);
    }

    @Override
    public StudentResponse getStudentById(Long studentId) {
        Student student= studentRepository.findById(studentId).get();
        School school=restTemplate.getForObject("http://localhost:8081/api/school/"+student.getSchoolId(),School.class);
        StudentResponse studentResponse=new StudentResponse(
                student.getStudentId(),
                student.getStudentName(),
                student.getStudentClass(),
                school
        );
        return studentResponse;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public String deleteStudentById(Long studentId) {
         studentRepository.deleteById(studentId);
         return "Successfully Deleted!!";
    }
}
