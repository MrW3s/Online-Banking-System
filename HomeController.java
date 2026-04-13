package com.banking;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HomeController {

    @FXML private Label nameLabel;
    @FXML private Label emailLabel;
    @FXML private Label phoneLabel;

    private User user;

    public void setUser(User user) {
        this.user = user;
        updateUI();
    }

    private void updateUI() {

        if (user == null) return;

        System.out.println("HomeController received: " + user.getName());

        nameLabel.setText("Name: " + user.getName());
        emailLabel.setText("Email: " + user.getEmail());
        phoneLabel.setText("Phone: " + user.getPhoneNumber());
    }
}