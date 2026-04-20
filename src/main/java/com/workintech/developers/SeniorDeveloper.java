package com.workintech.developers;

public class SeniorDeveloper extends Employee {

    public SeniorDeveloper(int id, String name, double salary) {
        super(id,name,salary);
    }

    public void work() {
        System.out.println("Senior starts to working");

        double currentSalary = getSalary();
        setSalary(currentSalary + 1435);

        System.out.println("New salary after work: " + getSalary());
    }
}
