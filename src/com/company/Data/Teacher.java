package com.company.Data;

public abstract class Teacher {
    protected String name;
    protected float baseSalary;

    public Teacher(String name, float baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract float calculateSalary();

    @Override
    public String toString() {
        return  "Name = " + name +
                ", Base Salary = " + baseSalary +
                ",  Final Salary = " + calculateSalary();
    }
}
