package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name, double salary) {
        super(id,name,salary);
    }

    public void work() {
        System.out.println("Mid starts to working");

        double currentSalary = getSalary();
        setSalary(currentSalary + 1435);

        System.out.println("New salary after work: " + getSalary());
    }
}
