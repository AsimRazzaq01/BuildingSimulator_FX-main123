package com.example.buildingsimulator_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));


    }

    public static void main(String[] args) {
        launch();
    }

    // Run simulation with 2 elevators, 10 passengers, and 5 iterations



}