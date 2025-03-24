import java.util.Scanner;

public class module_1_energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        double height;
        double width;
        
        double area;
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        System.out.print("\nEnter the width");
        width = input.nextDouble();
        
        area = height * width;
        
        System.out.println("\nThe area is " + area);
        
        // TODO code application logic here
    }
}
