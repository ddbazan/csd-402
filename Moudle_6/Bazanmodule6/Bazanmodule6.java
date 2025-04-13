/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *Destiny Bazan
 * Module6
 */
public class Bazanmodule6 {
    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius; 
    private String color; 

    public Bazanmodule6() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
    }

    public Bazanmodule6(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method
    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bazanmodule6 defaultFan = new Bazanmodule6();
        System.out.println("Default Fan: " + defaultFan);
        
        defaultFan.setOn(true);
        defaultFan.setSpeed(Bazanmodule6.MEDIUM);
        defaultFan.setColor("blue");
        System.out.println("Updated Default Fan: " + defaultFan);

        Bazanmodule6 customFan = new Bazanmodule6(Bazanmodule6.FAST, true, 10, "red");
        System.out.println("Custom Fan: " + customFan);
    }
}