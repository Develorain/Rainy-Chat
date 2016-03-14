package com.develorain.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage loginWindow) throws Exception {
        Parent anotherRoot = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        loginWindow.setTitle("Login");
        loginWindow.setScene(new Scene(anotherRoot));
        loginWindow.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
