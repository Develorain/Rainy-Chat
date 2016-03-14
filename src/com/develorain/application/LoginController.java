package com.develorain.application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    public void login() throws Exception {
        Stage loginWindow = (Stage) loginButton.getScene().getWindow();
        loginWindow.close();

        Stage chatWindow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("chatgui.fxml"));
        chatWindow.setTitle("Rainy Chat");
        chatWindow.setScene(new Scene(root));
        chatWindow.show();
    }
}
