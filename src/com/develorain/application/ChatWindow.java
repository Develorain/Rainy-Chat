package com.develorain.application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatWindow {
    private String name;
    private String address;
    private int port;
    private DatagramSocket socket;  //private Socket; for tcp
    private InetAddress ip;

    @FXML
    private TextArea messageLog;
    @FXML
    private TextField messageBox;
    @FXML
    private Button sendButton;

    @FXML
    public void sendMessage(KeyEvent event) {
        String message = messageBox.getText();

        if (event.getCode() != KeyCode.ENTER) {
            return;
        }

        if (message.equals("")) {
            return;
        }

        messageLog.appendText(name + ": " + message + "\n");
        messageBox.clear();
    }
}
