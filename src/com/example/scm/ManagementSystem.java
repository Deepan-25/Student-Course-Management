package com.example.scm;
import java.util.*;

public class ManagementSystem {
    private Map<Integer, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();

    public void addStudent(Student s) throws DuplicateStudentException {
        if (students.containsKey(s.getId())) throw new DuplicateStudentException("Student exists");
        students.put(s.getId(), s);
    }
    public void addCourse(Course c) throws DuplicateCourseException {
        if (courses.containsKey(c.getCourseId())) throw new DuplicateCourseException("Course exists");
        courses.put(c.getCourseId(), c);
    }
    public void enrollStudentInCourse(int studentId, String courseId)
            throws StudentNotFoundException, CourseNotFoundException {
        Student s = students.get(studentId);
        if (s == null) throw new StudentNotFoundException("Not found");
        Course c = courses.get(courseId);
        if (c == null) throw new CourseNotFoundException("Not found");
        s.enrollCourse(courseId);
    }
    public Student getStudent(int id) throws StudentNotFoundException {
        Student s = students.get(id);
        if (s == null) throw new StudentNotFoundException("Not found");
        return s;
    }
    public List<Student> listAllStudents() { return new ArrayList<>(students.values()); }
    public List<Course> listAllCourses() { return new ArrayList<>(courses.values()); }
}
