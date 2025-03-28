package org.example.test.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.test.services.AuthService;

public class AuthController {
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    private final AuthService authService = new AuthService();

    @FXML
    private void handleRegister() {
        try {
            authService.registerUser(
                    usernameField.getText(),
                    passwordField.getText()
            );
            statusLabel.setText("Registration successful!");
        } catch (Exception e) {
            statusLabel.setText("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}