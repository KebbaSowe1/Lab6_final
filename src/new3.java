import java.util.Scanner;

public class new3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons, fuelEfficiency, pricePerGallon;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); //
            }
            gallons = scanner.nextDouble();
        } while (gallons <= 0);

        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0);

        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double maxDistance = gallons * fuelEfficiency;

        System.out.printf("\nCost to drive 100 miles: $%.2f\n", costPer100Miles);
        System.out.printf("Maximum distance on a full tank: %.2f miles\n", maxDistance);
    }
}

