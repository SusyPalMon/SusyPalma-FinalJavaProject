package com.company.Data;

import java.util.List;

public class UniversityClass {

    private String name;
    private int assignedClassroom;

    // Create student List and teacher List
    private List<Student> studentListClass;
    private Teacher teacherClass;

    public UniversityClass(String name, int assignedClassroom, List<Student> studentListClass, Teacher teacherClass) {
        this.name = name;
        this.assignedClassroom = assignedClassroom;
        this.studentListClass = studentListClass;
        this.teacherClass = teacherClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAssignedClassroom() {
        return assignedClassroom;
    }

    public void setAssignedClassroom(int assignedClassroom) {
        this.assignedClassroom = assignedClassroom;
    }

    public List<Student> getStudentListClass() {
        return studentListClass;
    }

    public void setStudentListClass(List<Student> studentListClass) {
        this.studentListClass = studentListClass;
    }

    public Teacher getTeacherListClass() {
        return teacherClass;
    }

    public void setTeacherListClass(Teacher teacherListClass) {
        this.teacherClass = teacherListClass;
    }

    public void printClassDetails(){
        System.out.println("Class name: " + getName());
        System.out.println("Assigned classroom: " + getAssignedClassroom());
        System.out.println("Teacher name: " + getTeacherListClass().getName());
        System.out.println("Student List: ");
        System.out.println("");
        for (int i = 0; i < getStudentListClass().size(); i++) {
            System.out.println(getStudentListClass().get(i).toString());
        }
    }

    @Override
    public String toString() {
        return  "Class name = " + name +
                ", Assigned Classroom = " + assignedClassroom +
                ", Teacher name = " + teacherClass +
                ", studentListClass=" + studentListClass;
    }
}
