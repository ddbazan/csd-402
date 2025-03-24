import java.util.Scanner;

public class WaterHeatingCalcuBazan_m1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature of the water (in Celsius): ");
        double initialTemperature = scanner.nextDouble();

        System.out.print("Enter the final temperature of the water (in Celsius): ");
        double finalTemperature = scanner.nextDouble();

        // Calculate the energy required in Joules
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed to heat the water is: %.2f Joules%n", Q);

        scanner.close();
    }
}