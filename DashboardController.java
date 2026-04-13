package com.banking;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class DashboardController {

    @FXML private StackPane contentArea;
    @FXML private Label userLabel;

    private User user;

    public void setUser(User user) {
        this.user = user;

        if (userLabel != null) {
            userLabel.setText("Welcome, " + user.getName());
        }

        try {
            loadView("home.fxml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {}

    private void loadView(String fxml) throws IOException {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/" + fxml)
        );

        Parent view = loader.load();

        Object controller = loader.getController();

        if (user != null) {

            if (controller instanceof AccountController accController) {
                accController.setUser(user);
            }

            if (controller instanceof CardController cardController) {
                cardController.setUser(user);
            }

            if (controller instanceof HomeController homeController) {
                homeController.setUser(user);
            }
        }

        contentArea.getChildren().setAll(view);
    }

    @FXML
    private void showDashboard() throws IOException {
        loadView("home.fxml");
    }

    @FXML
    private void showAccounts() throws IOException {
        loadView("accounts.fxml");
    }

    @FXML
    private void showCards() throws IOException {
        loadView("cards.fxml");
    }
}