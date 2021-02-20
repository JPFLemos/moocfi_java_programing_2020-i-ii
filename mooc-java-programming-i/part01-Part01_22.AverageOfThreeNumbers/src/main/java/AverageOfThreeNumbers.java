
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double dOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double dTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double dThree = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + (dOne + dTwo + dThree) / 3);
    }
}
