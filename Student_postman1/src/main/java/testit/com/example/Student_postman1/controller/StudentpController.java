package testit.com.example.Student_postman1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testit.com.example.Student_postman1.model.Student;
import testit.com.example.Student_postman1.repository.StudentRepository;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/student/upload")
public class StudentpController {

    @Autowired
    private StudentRepository studentRepository;

    //post method
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
