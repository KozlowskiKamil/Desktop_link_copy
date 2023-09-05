package com.example.desktop_link_copy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
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

        Scene scene = new Scene(vbox, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
