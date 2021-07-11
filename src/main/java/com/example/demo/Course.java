package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    public String courseId;
    public String name;

    public Course(String courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }

    public Course() {

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


