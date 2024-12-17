import java.util.Scanner;

public class CashRegisterWithDiscount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**** Pizza House****");
        System.out.print("\nEnter the price of the meal: RM");
        double mealPrice = scanner.nextDouble();

        double salesTax = mealPrice * 0.0825;
        double totalPrice = mealPrice + salesTax;
        
        double discount = 0.0;
        if (totalPrice > 200.00) {
            discount = 0.10 * totalPrice; 
        } else if (totalPrice > 100.00) {
            discount = 0.05 * totalPrice; 
        } else {
            discount = 0.0;
        }
        totalPrice -= discount;
        

        System.out.printf("\nPrice of Meal: RM%.2f\n", mealPrice);
        System.out.printf("Sales Tax: RM%.2f\n", salesTax);
         System.out.printf("Discount: RM%.2f\n", discount);
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