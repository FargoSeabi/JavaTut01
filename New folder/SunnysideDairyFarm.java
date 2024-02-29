import java.util.Scanner;

public class SunnysideDairyFarm {
    public static void main(String[] args) {
        // Constants
        double dozenPrice = 125.67;
        double loosePrice = 3.5;

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of eggs in the order: ");
        int totalEggs = scanner.nextInt();

        // Calculations
        int dozens = totalEggs / 12;
        int looseEggs = totalEggs % 12;
        double totalAmount = (dozens * dozenPrice) + (looseEggs * loosePrice);

        // Output
        System.out.printf("You ordered %d eggs. That's %d dozen(s) at %.2f per dozen and %d loose eggs at %.2f for a total of R%.2f.%n",
                totalEggs, dozens, dozenPrice, looseEggs, loosePrice, totalAmount);
    }
}

