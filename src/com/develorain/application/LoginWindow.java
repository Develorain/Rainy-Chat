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

public class LoginWindow extends Application {
    @FXML
    private TextField nameBox;
    @FXML
    private TextField addressBox;
    @FXML
    private TextField portBox;
    @FXML
    private Button loginButton;

    public void loginButtonClicked() throws Exception {
        hideLoginWindow();
        createChatWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage loginWindow) throws Exception {
        initLoginWindow(loginWindow);
    }

    public void initLoginWindow(Stage loginWindow) throws Exception {
        Parent loginRoot = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        loginWindow.setTitle("Login");
        loginWindow.setScene(new Scene(loginRoot));
        loginWindow.show();
    }

    public void hideLoginWindow() {
        Window loginWindow = loginButton.getScene().getWindow();
        loginWindow.hide();
    }

    public void createChatWindow() throws Exception {
        new ChatWindow();
    }
}
