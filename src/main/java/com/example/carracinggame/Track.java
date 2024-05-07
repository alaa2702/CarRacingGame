package com.example.carracinggame;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class Track {
    private Canvas canvas;
    private GraphicsContext gc;

    public Track(Canvas canvas){
        this.canvas = canvas;
        this.gc = canvas.getGraphicsContext2D();


    }

    public void drawTrack() {
        //clear the canvas
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        //draw the grass
        gc.setFill(javafx.scene.paint.Color.GREEN);
        gc.strokeRect(0, 0, canvas.getWidth(), canvas.getHeight());
        // draw the road
        gc.setFill(javafx.scene.paint.Color.GRAY);
        gc.fillRect(50, 0, canvas.getWidth() - 100, canvas.getHeight());
        //draw the white lines
        gc.setFill(javafx.scene.paint.Color.WHITE);
        for (int i = 0; i < canvas.getHeight(); i += 100) {
            gc.fillRect(345, i, 10, 60);
        }
    }


}
