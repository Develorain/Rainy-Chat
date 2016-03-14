package com.develorain.application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {
    @FXML
    TextArea messageLog;

    @FXML
    TextField messageBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void sendMessage() {
        messageLog.appendText("Username: " + messageBox.getText());
        messageBox.clear();
    }
}
