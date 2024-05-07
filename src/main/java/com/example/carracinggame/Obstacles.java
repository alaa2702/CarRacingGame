package com.example.carracinggame;

public class Obstacles {
    private int position;
    private ObstaclesType type;

    public Obstacles(int position, ObstaclesType type) {
        this.position = position;
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public ObstaclesType getType() {
        return type;
    }
}
