package com.studentinfo.service;

import com.studentinfo.dto.StudentDto;
import com.studentinfo.model.Courses;
import com.studentinfo.model.Student;
import com.studentinfo.repository.CoursesRepository;
import com.studentinfo.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final CoursesRepository coursesRepository;

    private final ModelMapper modelMapper;

    public StudentService(StudentRepository studentRepository, CoursesRepository coursesRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.coursesRepository = coursesRepository;
        this.modelMapper = modelMapper;
    }


    public Student createStudents(Student s) {
        return studentRepository.save(s);
    }

    public StudentDto getStudentById(Long id) {
        Optional<Student> s = studentRepository.findById(id);
        return modelMapper.map(s, StudentDto.class);
    }





}
