package com.banking;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    @FXML
    private void handleLogin(ActionEvent event) throws IOException {

        String username = usernameField.getText();
        String password = passwordField.getText();

        User user = null;

        if (username.equals("user") && password.equals("1234")) {

            user = new User(
                    "John Doe",
                    "01/01/2000",
                    "1234567890",
                    "john@email.com"
            );

            user.addAccount(new CheckingAccount(1001, 500.0, 200.0));
            user.addAccount(new CheckingAccount(1002, 1200.0, 300.0));
        }

        else if (username.equals("dmw2348") && password.equals("2348")) {

            user = new User(
                    "Derek Wilkerson",
                    "03/12/2002",
                    "5551112222",
                    "dmw@email.com"
            );

            user.addAccount(new CheckingAccount(2001, 750.0, 250.0));
            user.addAccount(new CheckingAccount(2002, 1800.0, 400.0));
        }

        else if (username.equals("tw2999") && password.equals("2999")) {

            user = new User(
                    "Thomas Wesley",
                    "07/08/2001",
                    "4443332222",
                    "tw@email.com"
            );

            user.addAccount(new CheckingAccount(3001, 2500.0, 500.0));
        }

        if (user == null) {
            errorLabel.setText("Invalid login");
            return;
        }

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/dashboard.fxml")
        );

        Parent root = loader.load();

        DashboardController controller = loader.getController();
        controller.setUser(user);

        Stage stage = (Stage) usernameField.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}