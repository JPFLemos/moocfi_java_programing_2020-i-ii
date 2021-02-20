
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int n = 0;
        int nEven = 0;
        int nOdd = 0;
        
        System.out.println("Give numbers:");
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == -1) {
                break;
            }
            
            sum = sum + number;
            n++;
            
            if (number % 2 == 0) {
                nEven++;
            } else {
                nOdd++;
            }
        }
        
        double avg = 1.0 * sum / n;
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + n);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + nEven);
        System.out.println("Odd: " + nOdd);
    }
}
