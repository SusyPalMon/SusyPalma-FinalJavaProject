package com.company.Data;

public class FullTimeTeacher extends Teacher{

    private int experienceYears;

    public FullTimeTeacher(String name, float baseSalary, int experienceYears) {
        super(name, baseSalary);
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public float calculateSalary(){
        return baseSalary + (110/100 * experienceYears);
    }

    @Override
    public String toString() {
        return "FullTimeTeacher" +
                " " +super.toString() +
                ", Experience Years = " + experienceYears;
    }
}
