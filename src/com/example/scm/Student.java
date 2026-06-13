package com.example.scm;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<String> enrolledCourses;

    public Student(int id, String name) {
        this.id = id; this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public List<String> getEnrolledCourses() { return enrolledCourses; }
    public void enrollCourse(String courseId) {
        if (!enrolledCourses.contains(courseId)) enrolledCourses.add(courseId);
    }
    public void dropCourse(String courseId) { enrolledCourses.remove(courseId); }

    public String toString() {
        return "Student{id=" + id + ", name=" + name + ", courses=" + enrolledCourses + "}";
    }
}
