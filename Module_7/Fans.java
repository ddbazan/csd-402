/*
Destiny Bazan
Module 7
 */

import java.util.ArrayList;
import java.util.List;

public class Fans { // Capitalized class name
    private List<BazanModule7> fans;

    public Fans() { // Constructor name matches the class name
        this.fans = new ArrayList<>();
    }

    public void addFan(BazanModule7 fan) {
        this.fans.add(fan);
    }

    public void displayFans() {
        for (BazanModule7 fan : fans) {
            displayFan(fan);
        }
    }

    public void displayFan(BazanModule7 fan) {
        fan.displayFanDetails();  // Ensure this method exists in BazanModule7
    }

    public static void main(String[] args) {
        Fans fansManager = new Fans(); // Update instance variable to match class name

        BazanModule7 defaultFan = new BazanModule7(); 
        defaultFan.setOn(true);
        defaultFan.setSpeed(BazanModule7.MEDIUM);
        defaultFan.setColor("Blue");

        BazanModule7 customFan1 = new BazanModule7(BazanModule7.FAST, true, 10, "Red");
        BazanModule7 customFan2 = new BazanModule7(BazanModule7.SLOW, false, 5, "Green");

        fansManager.addFan(defaultFan);
        fansManager.addFan(customFan1);
        fansManager.addFan(customFan2);

        fansManager.displayFans();
    }
}
