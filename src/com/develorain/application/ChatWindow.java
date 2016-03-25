package com.develorain.application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ChatWindow {
    private String name;
    private String address;
    private int port;
    private DatagramSocket socket;    //private Socket; for tcp
    private InetAddress ip;

    @FXML
    private TextArea messageLog;
    @FXML
    private TextField messageBox;

    public ChatWindow() {
        Parent chatRoot = null;
        try {
            //chatRoot = FXMLLoader.load(getClass().getResource("logingui.fxml"));
            chatRoot = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage chatWindow = new Stage();
        chatWindow.setTitle("Rainy Chat");
        chatWindow.setScene(new Scene(chatRoot));
        chatWindow.show();

        /*messageBox.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                sendMessage();
            }
        });*/
    }

    public void sendMessage() {
        System.out.println("Sent message");
        if (!messageBox.getText().equals("")) {
            messageLog.appendText(name + ": " + messageBox.getText() + "\n");
        }

        messageBox.clear();
    }
}
