package com.example.carracinggame;

public class Game {
    private final Car car;
    private final Obstacles obstacles;
    private final UserInputHandler userInputHandler;

    public Game(Car car, Obstacles obstacles, UserInputHandler userInputHandler) {
        this.car = car;
        this.obstacles = obstacles;
        this.userInputHandler = userInputHandler;
    }

    public void play() {
        car.move();
    }

    public Car getCar() {
        return car;
    }

    public Obstacles getObstacles() {
        return obstacles;
    }

    public UserInputHandler getUserInputHandler() {
        return userInputHandler;
    }
}
