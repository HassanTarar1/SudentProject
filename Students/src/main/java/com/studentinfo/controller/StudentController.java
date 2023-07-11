package com.studentinfo.controller;

import com.studentinfo.dto.StudentDto;
import com.studentinfo.exception.CourseNotFoundException;
import com.studentinfo.exception.StudentNotFoundException;
import com.studentinfo.model.Courses;
import com.studentinfo.model.Student;
import com.studentinfo.repository.CoursesRepository;
import com.studentinfo.repository.StudentRepository;
import com.studentinfo.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    private final StudentRepository studentRepository;
    private final StudentService studentService;
    private final CoursesRepository coursesRepository;

    public StudentController(StudentRepository studentRepository, StudentService studentService, CoursesRepository coursesRepository) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
        this.coursesRepository = coursesRepository;
    }

    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody @Validated Student student) {
        return new ResponseEntity<>(studentService.createStudents(student), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public List<Student> GetAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) throws StudentNotFoundException {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @DeleteMapping("/delete")
    public String DeleteStudent() {
        studentRepository.deleteAll();
        return "Deleted Successfully";
    }

    @DeleteMapping("/delete/{id}")
    public String DeleteStudentById(@PathVariable Long id) throws StudentNotFoundException {
        try {
            studentRepository.deleteById(id);
            return ("record has been deleted successfully at id:" + id );
        } catch (Exception e) {
            throw  new StudentNotFoundException("student not found at: "+ id);
        }
    }


    @DeleteMapping("/delete/course/{id}")
    public String DeleteCourseById(@PathVariable Long id) throws CourseNotFoundException {


        try {
            coursesRepository.deleteById(id);
            return ("record has been deleted successfully at id:" + id );
        } catch (Exception e) {
            throw  new CourseNotFoundException("course not found at: "+ id);
        }


    }


}