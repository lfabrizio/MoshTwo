package com.fabrizio;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

        // 40 percent tax
    @Override
    public double calculateTax(){

        return taxableIncome * 0.3;
    }

}
