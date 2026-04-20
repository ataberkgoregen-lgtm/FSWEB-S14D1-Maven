package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name, double salary) {
        super(id,name,salary);
    }

    public void work() {
        System.out.println("Junior starts to working");

        double currentSalary = getSalary();
        setSalary(currentSalary + 1435);

        System.out.println("New salary after work: " + getSalary());
    }
}
