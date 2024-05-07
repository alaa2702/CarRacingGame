package com.example.carracinggame;


public class Car implements Runnable {
    private int speed;
    private int position;


    public Car(int speed, int position  ) {
        this.speed = speed;
        this.position = position;
    }
    public void run() {
        move();
    }

    public void move() {
        position += speed;
    }


    public int getPosition() {
        return position;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}
