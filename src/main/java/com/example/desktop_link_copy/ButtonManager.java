package com.example.desktop_link_copy;

import javafx.scene.control.Button;

public class ButtonManager {
    private final Service linkService = new Service();

    public Button createButton(String buttonText) {
        Button button = new Button(buttonText);
        button.setOnAction(event -> handleButtonClick(buttonText));
        return button;
    }

    private void handleButtonClick(String buttonText) {
        linkService.copyLinkToClipboard(buttonText);
    }
}