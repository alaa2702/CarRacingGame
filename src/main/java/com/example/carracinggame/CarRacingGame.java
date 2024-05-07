package com.example.carracinggame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CarRacingGame extends Application {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Car Racing Game");

        Pane root = new Pane();
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        primaryStage.setScene(scene);

        // Create and add game elements to the root pane

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}