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
    private Long student_id;

    public Courses(Long id, String subject, Long student_id) {
        this.id = id;
        this.subject = subject;
        this.student_id = student_id;
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

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", student_id=" + student_id +
                '}';
    }
}