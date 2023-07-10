package com.studentinfo.dto;


public class CoursesDto {
    private String subject;
    private Long studentId;

    public CoursesDto() {
    }

    public CoursesDto(String subject, Long studentId) {
        this.subject = subject;
        this.studentId = studentId;
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
        return "CoursesDto[" +
                "subject='" + subject + '\'' +
                ", studentId=" + studentId +
                ']';
    }
}
