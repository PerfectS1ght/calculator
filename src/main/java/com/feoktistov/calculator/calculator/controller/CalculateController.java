package com.feoktistov.calculator.calculator.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    protected void onButtonClick(javafx.event.ActionEvent event) {
        String input = ((Button) event.getSource()).getText();
        if ("0".equals(sb.toString())) {
            sb.setLength(0);
        }
        sb.append(input);
        updateDisplay(sb.toString());
    }

    @FXML
    protected void onCleanButtonClick() {
        sb.setLength(0);
        sb.append('0');
        updateDisplay(sb.toString());
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
