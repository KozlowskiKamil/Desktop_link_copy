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

    private static VBox getvBox() {
        ButtonManager buttonManager = new ButtonManager();
        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(buttonManager
                        .createButton("LinkedIn"),
                buttonManager.createButton("GitHub"),
                buttonManager.createButton("Portfolio"),
                buttonManager.createButton("Email"),
                buttonManager.createButton("Mobile"),
                buttonManager.createButton("Location"),
                buttonManager.createButton("Description"));
        return vbox;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Link Copy App");

        VBox vbox = getvBox();

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