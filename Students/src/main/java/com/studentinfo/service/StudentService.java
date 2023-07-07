package com.studentinfo.service;

import com.studentinfo.model.Student;
import com.studentinfo.repository.StudentRepository;
import com.studentinfo.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StudentService {

//    @Autowired
//    StudentRepository studentRepository;



   private final StudentRepository studentRepository;

   private ModelMapper modelMapper;

    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }


    public Student creatstudents(Student s) {
        return studentRepository.save(s);
    }

    public StudentDto getStudentbyId(Long id) {

        Optional<Student> s=studentRepository.findById(id);
        return modelMapper.map(s, StudentDto.class);

    }
}
