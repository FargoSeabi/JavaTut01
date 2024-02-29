import java.util.Arrays;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        System.out.println("Hello Class");
        displayInfo();
        ArrayE();
    }

    public static void displayInfo() {

        System.out.println("The information gathered is as follow : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you employed?");
        String employedStatus = scanner.nextLine();

        System.out.println("Which degree did you do?");
        String institution = scanner.nextLine();

        System.out.println("In which year?");
        int year = scanner.nextInt();
        scanner.close();
    }

    public static void ArrayE() {
        int[] numbers = { 2, 5, 4, 3, 7 };

            System.out.println(Arrays.toString(numbers));
        
    }
}
