
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            n = n + 1;
            sum = sum + number;
        }
        
        if (n > 0) {
            double avg = 1.0 * sum / n;
            System.out.println("Average of the numbers: " + avg );
        }
    }   
}
