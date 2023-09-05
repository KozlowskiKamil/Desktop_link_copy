package com.example.desktop_link_copy;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Button copyLinkedinButton = new Button("LinkedIn");
        Button copyGithubButton = new Button("GitHub");
        Button copyPortfolioButton = new Button("Portfolio");
        Button copyEmailButton = new Button("Email");
        Button copyMobileButton = new Button("Mobile");
        Button copyLocationButton = new Button("Location");
        Button copyDescriptionButton = new Button("Description");

        EventHandler<ActionEvent> copyButtonHandler = event -> {
            Button clickedButton = (Button) event.getSource();
            String buttonText = clickedButton.getText();
            linkService.copyLinkToClipboard(buttonText);
        };

        copyLinkedinButton.setOnAction(copyButtonHandler);
        copyGithubButton.setOnAction(copyButtonHandler);
        copyPortfolioButton.setOnAction(copyButtonHandler);
        copyEmailButton.setOnAction(copyButtonHandler);
        copyMobileButton.setOnAction(copyButtonHandler);
        copyLocationButton.setOnAction(copyButtonHandler);
        copyDescriptionButton.setOnAction(copyButtonHandler);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(copyLinkedinButton, copyGithubButton, copyPortfolioButton, copyEmailButton, copyMobileButton, copyLocationButton, copyDescriptionButton);
        Scene scene = new Scene(vbox, 300, 350);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
