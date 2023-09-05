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
        links.setLocation("Gdansk");
        links.setDescription("Please consider my CV for the given position");

    }

    public String getLink(String linkName) {
        switch (linkName) {
            case "LinkedIn":
                return links.getLinkedin();
            case "GitHub":
                return links.getGithub();
            case "Portfolio":
                return links.getPortfolio();
            case "Email":
                return links.getEmail();
            case "Mobile":
                return links.getMobile();
            case "Location":
                return links.getMobile();
            case "Description":
                return links.getMobile();
            default:
                return null;
        }
    }

    public void copyLinkToClipboard(String linkName) {
        String link = getLink(linkName);
        if (link != null) {
            Clipboard clipboard = Clipboard.getSystemClipboard();
            ClipboardContent content = new ClipboardContent();
            content.putString(link);
            clipboard.setContent(content);
        }
    }
}