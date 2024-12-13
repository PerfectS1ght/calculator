package com.feoktistov.calculator.calculator;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Main {
    public static void main(String[] args) {


        String expression = "25*3+2";
        Expression exp = new ExpressionBuilder(expression).build();
        double result = exp.evaluate();
        System.out.println("Result: " + result); // Output: 500.0
    }
}
