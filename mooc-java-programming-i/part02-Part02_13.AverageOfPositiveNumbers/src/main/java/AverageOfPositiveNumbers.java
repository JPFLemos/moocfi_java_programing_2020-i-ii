
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nPositives = 0;
        int sumPositives = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            
            if (number > 0){
                nPositives = nPositives + 1;
                sumPositives = sumPositives + number;
            }
          
        }
        
        if (nPositives > 0) {
            double avgPositives = 1.0 * sumPositives / nPositives;
            System.out.println(avgPositives);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
