
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int dOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int dTwo = Integer.valueOf(scanner.nextLine());
        
        System.out.println(dOne + " + " + dTwo + " = " + (dOne + dTwo));
        System.out.println(dOne + " - " + dTwo + " = " + (dOne - dTwo));
        System.out.println(dOne + " * " + dTwo + " = " + (dOne * dTwo));
        System.out.println(dOne + " / " + dTwo + " = " + (1.0 * dOne / dTwo));
    }
}
