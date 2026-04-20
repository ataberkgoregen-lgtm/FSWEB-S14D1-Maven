package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
// double salary, int jCount, int mCount, int sCount
    public HRManager(int id, String name, double salary) {
        super(id,name,salary);
        // this.juniorDevelopers = new JuniorDeveloper[jCount];
        // this.midDevelopers = new MidDeveloper[mCount];
        // this.seniorDevelopers = new SeniorDeveloper[sCount];
    }

    public void  addEmployee(int index, JuniorDeveloper developer){
        if(juniorDevelopers[index] == null) {
            juniorDevelopers[index] = developer;
        } else {
            System.out.println("Bu index dolu1");
        }
    }

    public void  addEmployee(int index, MidDeveloper developer){
        if(midDevelopers[index] == null) {
            midDevelopers[index] = developer;
        } else {
            System.out.println("Bu index dolu1");
        }
    }

    public void  addEmployee(int index, SeniorDeveloper developer){
        if(seniorDevelopers[index] == null) {
            seniorDevelopers[index] = developer;
        } else {
            System.out.println("Bu index dolu1");
        }
    }
}
