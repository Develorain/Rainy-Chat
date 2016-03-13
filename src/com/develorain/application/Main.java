package com.develorain.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static final String TITLE = "Rainy Chat";
    private static final int WIDTH = 1080;
    private static final int HEIGHT = 720;

    @Override
    public void start(Stage chatWindow) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chatgui.fxml"));
        chatWindow.setTitle(TITLE);
        chatWindow.setScene(new Scene(root, WIDTH, HEIGHT));
        chatWindow.show();

        Stage loginWindow = new Stage();
        Parent anotherRoot = FXMLLoader.load(getClass().getResource("logingui.fxml"));
        Scene anotherScene = new Scene(anotherRoot);
        loginWindow.setScene(anotherScene);
        loginWindow.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
