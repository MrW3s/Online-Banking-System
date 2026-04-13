package com.banking;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class CardController {

    @FXML private TableView<?> cardTable;

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    @FXML
    private void handleAddCard() {
        if (user != null) {
            System.out.println("Add card clicked for: " + user.getName());
        } else {
            System.out.println("Add card clicked (no user loaded)");
        }
    }

    @FXML
    private void handleRemoveCard() {
        if (user != null) {
            System.out.println("Remove card clicked for: " + user.getName());
        } else {
            System.out.println("Remove card clicked (no user loaded)");
        }
    }
}