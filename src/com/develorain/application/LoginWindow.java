package com.develorain.application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class LoginWindow extends Application {
    @FXML
    private TextField nameBox;
    @FXML
    private TextField addressBox;
    @FXML
    private TextField portBox;
    @FXML
    private Button loginButton;

    @Override
    public void start(Stage loginWindow) {
        try {
            Parent loginRoot = FXMLLoader.load(getClass().getResource("logingui.fxml"));
            loginWindow.setTitle("Login");
            loginWindow.setScene(new Scene(loginRoot));
            loginWindow.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loginButtonClicked() {
        hideLoginWindow();
        createChatWindow();
    }

    public void hideLoginWindow() {
        Window loginWindow = loginButton.getScene().getWindow();
        loginWindow.hide();
    }

    public void createChatWindow() {
        new ChatWindow();
    }
}
