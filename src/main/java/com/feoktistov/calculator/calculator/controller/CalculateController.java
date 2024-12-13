package com.feoktistov.calculator.calculator.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class CalculateController {

    private final StringBuilder sb;

    public CalculateController() {
        this.sb = new StringBuilder();
    }

    @FXML
    private Label displayLabel;

    @FXML
    protected void onCleanButtonClick() {
        sb.setLength(0);
        sb.append('0');
        updateDisplay(sb.toString());
    }

    @FXML
    protected void onButton1Click() {
        char digit = '1';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton2Click() {
        char digit = '2';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton3Click() {
        char digit = '3';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton4Click() {
        char digit = '4';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton5Click() {
        char digit = '5';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton6Click() {
        char digit = '6';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton7Click() {
        char digit = '7';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton8Click() {
        char digit = '8';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton9Click() {
        char digit = '9';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onButton0Click() {
        char digit = '0';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onMultiplyButtonClick() {
        char digit = '*';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onDivButtonClick() {
        char digit = '/';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onSumButtonClick() {
        char digit = '+';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onSubButtonClick() {
        char digit = '*';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onPointButtonClick() {
        char digit = '.';
        sb.append(digit);
        System.out.println("Добавлено число в StringBuilder - " + sb.toString());
    }

    @FXML
    protected void onEqualsButtonClick() {
        String expression = sb.toString();
        Expression exp = new ExpressionBuilder(expression).build();
        double result = exp.evaluate();
        updateDisplay(String.valueOf(result));
    }


    public void updateDisplay(String text) {
        displayLabel.setText(text);
    }


    public StringBuilder getSb() {
        return sb;
    }
}
