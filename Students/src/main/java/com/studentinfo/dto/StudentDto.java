package com.studentinfo.dto;

import com.studentinfo.model.Courses;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;


public class StudentDto {


    private String firstName; // camel case
    private String lastName;
    private double gpa;


    @OneToMany(targetEntity = Courses.class, cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "id")
    private List<Courses> courses;

    public StudentDto(String firstName, String lastname, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.gpa = gpa;
    }
    public StudentDto() {

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

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + firstName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
