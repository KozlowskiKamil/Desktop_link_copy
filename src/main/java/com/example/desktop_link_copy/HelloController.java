package com.example.desktop_link_copy;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    private final Service service;

    public HelloController() {
        this.service = new Service();
    }

    @FXML
    protected void copyLinkToClipboard(String linkName) {
        service.copyLinkToClipboard(linkName);
    }

    @FXML
    protected void copyLinkToClipboardGitHub() {
        copyLinkToClipboard("GitHub");
    }

    @FXML
    protected void copyLinkToClipboardLinkedIn() {
        copyLinkToClipboard("LinkedIn");
    }

    @FXML
    protected void copyLinkToClipboardPortfolio() {
        copyLinkToClipboard("Portfolio");
    }

    @FXML
    protected void copyLinkToClipboardEmail() {
        copyLinkToClipboard("Email");
    }

    @FXML
    protected void copyLinkToClipboardMobile() {
        copyLinkToClipboard("Mobile");
    }

    @FXML
    protected void copyLinkToClipboardLocation() {
        copyLinkToClipboard("Location");
    }

    @FXML
    protected void copyLinkToClipboardDescription() {
        copyLinkToClipboard("Description");
    }
}
