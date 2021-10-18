package com.company.Data;

public class PartTimeTeacher extends Teacher{

    private float activeHoursPerWeek;

    public PartTimeTeacher(String name, float baseSalary, float activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public float getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(float activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public float calculateSalary(){
        return baseSalary * activeHoursPerWeek;
    }

    @Override
    public String toString() {
        return "PartTimeTeacher" +
                " " + super.toString() +
                ", Active Hours Per Week = " + activeHoursPerWeek;
    }
}
