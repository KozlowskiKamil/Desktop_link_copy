package com.example.desktop_link_copy;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Link Copy App");

        Service linkService = new Service();

        Button copyLinkedinButton = new Button("Kopiuj LinkedIn");
        copyLinkedinButton.setOnAction(event -> {
            linkService.copyLinkToClipboard("LinkedIn");
        });

        Button copyGithubButton = new Button("Kopiuj GitHub");
        copyGithubButton.setOnAction(event -> {
            linkService.copyLinkToClipboard("GitHub");
        });


        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(copyLinkedinButton, copyGithubButton);
        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}