package oop.labor03.lab3_extra.models;

import java.time.DayOfWeek;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private int credits;
    private DayOfWeek dayOfWeek;
    private Teacher teacher;
    private List<Student> students = new ArrayList<>();
    private static final int MAX_STUDENTS = 120;

    public Course(String courseId, int credits, DayOfWeek dayOfWeek) {
        this.courseId = courseId;
        this.credits = credits;
        this.dayOfWeek = dayOfWeek;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void enrollStudent(Student student) {
        if (students.size() < MAX_STUDENTS) {
            students.add(student);
        } else {
            System.out.println("A kurzus betelt.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course: ").append(courseId).append(":\n");
        sb.append("Teacher: ").append(teacher).append("\n");
        sb.append("Credits: ").append(credits).append("\n");
        sb.append("Occurs every: ").append(dayOfWeek).append("\n");
        sb.append("Enrolled students: ").append(students.size()).append("\n");
        for (Student student : students) {
            sb.append("- ").append(student).append("\n");
        }
        return sb.toString();
    }

}
