
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double dOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double dTwo = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + (dOne + dTwo) / 2);
    }
}
