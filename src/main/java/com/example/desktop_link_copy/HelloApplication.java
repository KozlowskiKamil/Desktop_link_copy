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
        Service service = new Service();
        primaryStage.setTitle("Link Copy App");

        Links links = new Links();
        links.setLinkedin("https://www.linkedin.com/in/your-linkedin");
        links.setGithub("https://github.com/your-github");


        Button linkedIn = new Button("Kopiuj LinkedIn");
        linkedIn.setOnAction(event -> {
            service.copyLinkedinLinkToClipboard();
        });

        Button github = new Button("Kopiuj Github");
        linkedIn.setOnAction(event -> {
            service.copyLinkedinLinkToClipboard();
        });



        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(linkedIn);
        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}