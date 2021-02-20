
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while (true) {
            String row = scanner.nextLine();
            
            if (row.equals("end")){
                break;
            }
            
            input.add(row);
            
        }
        
        double average = input.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        
        System.out.println("average of the number: " + average);
        // Write your program here

    }
}
