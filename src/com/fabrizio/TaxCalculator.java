package com.fabrizio;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

        // 30 percent tax
    public double calculateTax(){
        return taxableIncome * 0.3;
    }

}
