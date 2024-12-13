package com.feoktistov.calculator.calculator;

public class Calculator {

    private double currentValue;

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double sum(double value) {
        return currentValue += value;
    }

    public double sub(double value) {
        return currentValue -= value;
    }

    public double multiply(double value) {
        return currentValue *= value;
    }

    public double div(double value) {
        return currentValue *= value;
    }

    public void clear() {
        currentValue = 0;
    }
}
