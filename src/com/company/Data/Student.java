package com.company.Data;

public class Student {

    private String nameStudent;
    private int idStudent;
    private int ageStudent;
    private static int studentCounter;

    public Student(String nameStudent, int ageStudent) {
        this.nameStudent = nameStudent;
        this.idStudent = ++studentCounter;
        this.ageStudent = ageStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    @Override
    public String toString() {
        return  "idStudent = " + idStudent +
                ", nameStudent = " + nameStudent +
                ", ageStudent = " + ageStudent;
    }
}
