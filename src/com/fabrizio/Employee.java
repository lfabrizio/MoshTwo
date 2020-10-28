package com.fabrizio;

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("error");
            this.baseSalary = baseSalary;
    }

        public int getBaseSalary(){
        return baseSalary;
        }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
