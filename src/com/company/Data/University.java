package com.company.Data;

import java.util.List;

public class University {
    private List<Teacher> universityTeacherList;
    private List<Student> universityStudentsList;
    private List<UniversityClass> universityClassList;

    public University(List<Teacher> universityTeacherList, List<Student> universityStudentsList, List<UniversityClass> universityClassList) {
        this.universityTeacherList = universityTeacherList;
        this.universityStudentsList = universityStudentsList;
        this.universityClassList = universityClassList;
    }

    public List<Teacher> getUniversityTeacherList() {
        return universityTeacherList;
    }

    public void setUniversityTeacherList(List<Teacher> universityTeacherList) {
        this.universityTeacherList = universityTeacherList;
    }

    public List<Student> getUniversityStudentsList() {
        return universityStudentsList;
    }

    public void setUniversityStudentsList(List<Student> universityStudentsList) {
        this.universityStudentsList = universityStudentsList;
    }

    public List<UniversityClass> getUniversityClassList() {
        return universityClassList;
    }

    public void setUniversityClassList(List<UniversityClass> universityClassList) {
        this.universityClassList = universityClassList;
    }
}
