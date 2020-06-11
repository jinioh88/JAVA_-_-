package com.example.java_design.ch1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Professor advisor;
    private List<Transcript> transcripts;

    public Student(Professor advisor) {
        this.advisor = advisor;
        this.transcripts = new ArrayList<>();
    }

    public void dropCourse(Course course) {}
}
