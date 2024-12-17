import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**** Pizza House****");
        System.out.print("\nEnter the price of the meal: RM");
        double mealPrice = scanner.nextDouble();

        double salesTax = mealPrice * 0.0825;
        double totalPrice = mealPrice + salesTax;

        System.out.printf("\nPrice of Meal: RM%.2f\n", mealPrice);
        System.out.printf("Sales Tax: RM%.2f\n", salesTax);
        System.out.println("--------------------------------");
        System.out.printf("Total Amount: RM%.2f\n\n", totalPrice);

        System.out.print("Enter amount tendered: RM");
        double amountTendered = scanner.nextDouble();

        double change = amountTendered - totalPrice;

        System.out.printf("\nAmount Tendered: RM%.2f\n", amountTendered);
        System.out.printf("Total Amount: RM%.2f\n", totalPrice);
        System.out.println("--------------------------------");
        System.out.printf("Change Cash: RM%.2f\n\n", change);

        System.out.print("**** Thank You *****");
    }
}