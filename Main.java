package com.banking;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/login.fxml"));

        Parent root = loader.load(); // safer than inline load

        stage.setScene(new Scene(root));
        stage.setMaximized(true);
        stage.setTitle("Banking App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}