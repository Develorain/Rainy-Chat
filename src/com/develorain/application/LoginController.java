package com.develorain.application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    TextField nameBox;

    @FXML
    TextField addressBox;

    @FXML
    TextField portBox;

    @FXML
    Button loginButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void login() {

    }
}
