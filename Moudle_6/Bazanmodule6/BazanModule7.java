/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *Destiny Bazan
 * Module6
 */
public class BazanModule7 {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius; 
    private String color; 

    public BazanModule7() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public BazanModule7(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayFanDetails() {
        if (this.isOn()) {
            System.out.println("Fan is ON:");
            System.out.println("Speed: " + this.getSpeed());
            System.out.println("Color: " + this.getColor());
            System.out.println("Radius: " + this.getRadius());
        } else {
            System.out.println("Fan is OFF:");
            System.out.println("Color: " + this.getColor());
            System.out.println("Radius: " + this.getRadius());
        }
        System.out.println("--------------------------");
    }
}