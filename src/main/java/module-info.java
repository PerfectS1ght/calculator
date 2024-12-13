module com.feoktistov.calculator.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires exp4j;


    opens com.feoktistov.calculator.calculator to javafx.fxml;
    exports com.feoktistov.calculator.calculator;
    exports com.feoktistov.calculator.calculator.controller;
    opens com.feoktistov.calculator.calculator.controller to javafx.fxml;
}