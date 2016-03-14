package com.develorain.application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {
    private String name;
    private String address;
    private int port;

    @FXML
    private TextArea messageLog;

    @FXML
    private TextField messageBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        name = LoginController.name;
        address = LoginController.address;
        port = LoginController.port;

        messageBox.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                sendMessage();
            }
        });
    }

    public void sendMessage() {
        if (!messageBox.getText().equals("")) {
            messageLog.appendText(name + ": " + messageBox.getText() + "\n");
        }

        messageBox.clear();
    }
}
