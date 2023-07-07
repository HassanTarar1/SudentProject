package com.studentinfo.dto;


import javax.persistence.Column;
import javax.persistence.JoinColumn;


public class CoursesDto {

    private String subject;

    @Column(name = "student_id")
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long student_id;

    public CoursesDto(String subject, Long student_id) {
        this.subject = subject;
        this.student_id = student_id;
    }



    public CoursesDto() {}


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Courses{" +
                ", subjects='" + subject + '\'' +
                '}';
    }
}
