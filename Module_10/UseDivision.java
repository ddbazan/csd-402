/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author desti
 */
public class UseDivision {
    public static void main(String[] args) {
        // Create two InternationalDivision instances
        InternationalDivision intlDiv1 = new InternationalDivision("Global Tech", "INT12345", "Japan", "Japanese");
        InternationalDivision intlDiv2 = new InternationalDivision("Euro Markets", "INT67890", "Germany", "German");

        // Create two DomesticDivision instances
        DomesticDivision domesticDiv1 = new DomesticDivision("North America", "DOM54321", "California");
        DomesticDivision domesticDiv2 = new DomesticDivision("Southern Region", "DOM98765", "Texas");

        // Display information
        intlDiv1.display();
        intlDiv2.display();
        domesticDiv1.display();
        domesticDiv2.display();
    }
}