package com.studentinfo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "Courses")
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Subject is required")
    private String subject;

    @Column(name = "student_id")
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long studentId;

    public Courses(Long id, String subject, Long studentId) {
        this.id = id;
        this.subject = subject;
        this.studentId = studentId;
    }

    public Courses() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}