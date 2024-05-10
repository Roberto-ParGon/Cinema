package com.proyecto.cinema;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CinemaApplication extends Application {
    @Override
    public void start(Stage stage) {
        Login login = new Login();
        var root = login.getRoot();
        Scene scene = new Scene(root, 800, 600);
        stage.setTitle("Cinema App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}