package com.example.desktop_link_copy;

import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;

public class Service {

    private Links links;

    public Service() {
        links = new Links();
        links.setLinkedin("https://www.linkedin.com/in/kozlowski-kamil/");
        links.setGithub("https://github.com/KozlowskiKamil");
        links.setPortfolio("https://kozlowskikamil.github.io/");
        links.setEmail("kozlowski.kamil2k@gmail.com");
        links.setMobile("+48697333067");
        links.setDescription("Please consider my CV for the given position");

    }

    public String getLinkedinLink() {
        return links.getLinkedin();
    }

    public void copyLinkedinLinkToClipboard() {
        String linkedinLink = getLinkedinLink();
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent content = new ClipboardContent();
        content.putString(linkedinLink);
        clipboard.setContent(content);
    }


}