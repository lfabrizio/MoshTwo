package com.fabrizio;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
    setBaseSalary(baseSalary);
    setHourlyRate(hourlyRate);
    numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public Employee(int baseSalary){
        setBaseSalary(baseSalary);

    }

    public int calculateWage(int extraHours){

        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){

        return baseSalary;
    }

    private void setBaseSalary(int baseSalary){
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

    public void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("hourly rate cannot");
    this.hourlyRate = hourlyRate;
    }
}
