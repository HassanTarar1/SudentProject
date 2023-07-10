package com.studentinfo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.executable.ValidateOnExecution;
import java.util.Set;

@Table(name = "Student")
@Entity
@ValidateOnExecution
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull(message = "First name is required")
    @Min(3)
    @Max(10)
    private String firstName; // camel case
    @NotNull(message = "Last name is required")
    @Min(3)
    @Max(10)
    private String lastName;
    @NotNull(message = "Gpa is required")
    private double gpa;

    @OneToMany(targetEntity = Courses.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Set<Courses> courses;

    public Student(long id, String firstName, String lastname, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public Student(long id, @NotNull(message = "First name is required") String firstName, @NotNull(message = "Last name is required") String lastName, @NotNull(message = "Gpa is required") double gpa, Set<Courses> courses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.courses = courses;
    }

    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Set<Courses> getCourses() {
        return courses;
    }

    public void setCourses(Set<Courses> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
