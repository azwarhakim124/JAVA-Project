import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of litres of petrol in the tank: ");
        double fuelintank = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in kilometre per litre): ");
        double fuelefficiency = scanner.nextDouble();

        System.out.print("Enter the price of petrol per litre: ");
        double priceperlitre = scanner.nextDouble();

        double price = (100 / fuelefficiency) * priceperlitre;
        double distance = fuelintank * fuelefficiency;

        System.out.printf("The cost per 100 kilometers is: $%.2f.\n", price);
        System.out.printf("The car can go %.2fkm with the %.2fL petrol in the tank.", distance, fuelintank);
    }
}
