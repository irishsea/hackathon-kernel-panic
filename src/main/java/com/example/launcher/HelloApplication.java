package com.example.launcher;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Launcher.fxml"));
        Stage stage = fxmlLoader.load();
        stage.setTitle("Hello!");
        stage.setResizable(false);
        stage.getScene().getStylesheets().addAll(getClass().getResource(
                "outline.css").toExternalForm());
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}