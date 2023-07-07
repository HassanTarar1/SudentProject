package com.studentinfo.controller;

import com.studentinfo.repository.StudentRepository;
import com.studentinfo.service.StudentService;
import com.studentinfo.dto.StudentDto;
import com.studentinfo.exception.StudentNotFoundException;
import com.studentinfo.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {


    private final StudentRepository studentRepository;
    private final StudentService studentService;

    public StudentController(StudentRepository studentRepository, StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }


    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody @Validated Student student) {
        return new ResponseEntity<>(studentService.creatstudents(student), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) throws StudentNotFoundException {
        return ResponseEntity.ok(studentService.getStudentbyId(id));
    }

    @DeleteMapping("/delete")
    public String DeleteStudent() {
        studentRepository.deleteAll();
        return "Deleted Successfully";
    }
}