package com.example.brocodejavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels
        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");

        // Create text fields
        TextField emailField = new TextField();
        PasswordField passwordField = new PasswordField();

        // Create buttons
        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        // Set action for submit button
        submitButton.setOnAction(e -> {
            String enteredPassword = passwordField.getText();
            if (enteredPassword.equals("123")) {
                // Show confirmation alert
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Confirmation");
                alert.setHeaderText(null);
                alert.setContentText("Password is correct!");
                alert.showAndWait();
            } else {
                // Show error alert
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Incorrect password. Please try again.");
                alert.showAndWait();
            }
        });

        // Set action for clear button
        clearButton.setOnAction(e -> {
            emailField.clear();
            passwordField.clear();
        });

        // Create GridPane and set its properties
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add elements to the GridPane
        gridPane.add(emailLabel, 0, 0);
        gridPane.add(emailField, 1, 0);
        gridPane.add(passwordLabel, 0, 1);
        gridPane.add(passwordField, 1, 1);
        gridPane.add(submitButton, 0, 2);
        gridPane.add(clearButton, 1, 2);

        // Set up the scene and stage
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("Grid Pane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
