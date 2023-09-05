package com.example.desktop_link_copy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Link Copy App");

        ButtonManager buttonManager = new ButtonManager();

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(buttonManager.createButton("LinkedIn"), buttonManager.createButton("GitHub"), buttonManager.createButton("Portfolio"), buttonManager.createButton("Email"), buttonManager.createButton("Mobile"), buttonManager.createButton("Location"), buttonManager.createButton("Description"));

        Scene scene = new Scene(vbox, 120, 250);
        primaryStage.setAlwaysOnTop(true);
        double screenWidthInPixels = Screen.getPrimary().getBounds().getWidth();
        double oneCmInPixels = 100;
        double sceneHeight = 900;
        double posX = screenWidthInPixels - oneCmInPixels;
        double posY = (screenWidthInPixels - sceneHeight) / 2;
        primaryStage.setX(posX);
        primaryStage.setY(posY);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}