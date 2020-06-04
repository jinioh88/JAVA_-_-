package com.example.java_design.ch1;

import java.util.List;

public class Student {
    private Professor advisor;
    private List<Course> course;

    public void registerCourse(Course course) {
        this.course.add(course);
    }

    public void dropCourse(Course course) {}
}
