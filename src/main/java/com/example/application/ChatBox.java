package com.example.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ChatBox extends Application implements InterfaceUI {
    @Override
    public void start(Stage stage) throws IOException {
        URL url = new File(RESOURCES + CHATBOX).toURI().toURL();
        FXMLLoader fxmlLoader = new FXMLLoader(url);

        Scene scene = new Scene(fxmlLoader.load(), 900, 600);

        stage.setTitle("Messenger");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}