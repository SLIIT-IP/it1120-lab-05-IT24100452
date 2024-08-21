import java.util.Scanner;

public class IT24100452Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;

        Scanner input = new Scanner(System.in);

    
        System.out.println("Enter start date (1-31): ");
        int startDate = input.nextInt();
        System.out.println("Enter end date (1-31): ");
        int endDate = input.nextInt();

    
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

   
        int daysReserved = endDate - startDate + 1;
        int discountRate = 0;

      
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = 10;
        } else if (daysReserved >= 5) {
            discountRate = 20;
        }

  
        int totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        int discount = (totalAmount * discountRate) / 100;
        int finalAmount = totalAmount - discount;

     
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + finalAmount);
    }
}
