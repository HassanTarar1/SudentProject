//package com.studentinfo.repository;
//
//import com.studentinfo.model.Courses;
//import com.studentinfo.model.Student;
//import com.studentinfo.repository.StudentRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.assertj.core.api.Java6Assertions.assertThat;
//
//@SpringBootTest
//class studentRepositoryTest {
//
//    private final StudentRepository studentRepository;
//
//    studentRepositoryTest(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//
//    @Test
//    void createStudent() {
//        Courses c = new Courses();
//        c.setId(1L);
//        c.setSubject("maths");
//        Set<Courses> courses = new HashSet<>();
//        courses.add(c);
//
//        Student s = new Student(1567, "hassan", "hasanna", 5, courses);
//        studentRepository.save(s);
//
//    }
//
//    @Test
//    void getStudentbyId(){
//        Courses c = new Courses();
//        c.setId(1L);
//        c.setSubject("maths");
//        Set<Courses> courses = new HashSet<>();
//        courses.add(c);
//
//        Student s = new Student(1567, "hassan", "hasanna", 5, courses);
//        studentRepository.save(s);
//
//
//    }
//
//
//
//
//
//
//}