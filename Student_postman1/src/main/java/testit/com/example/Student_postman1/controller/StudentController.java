package testit.com.example.Student_postman1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testit.com.example.Student_postman1.exception.ResourceNotFoundException;
import testit.com.example.Student_postman1.model.Student;
import testit.com.example.Student_postman1.repository.StudentRepository;

import java.util.List;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

//    @GetMapping
//    public List<Student> getALLStudents(){
//        return studentRepository.findAll();
//
//    }

    // build get employee by id REST API
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id){
        Student student = studentRepository.findById(1L)
                .orElseThrow();
        return ResponseEntity.ok(student);
    }
}


