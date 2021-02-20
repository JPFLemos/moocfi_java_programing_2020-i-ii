
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int numberInput = Integer.valueOf(scanner.nextLine());
            if (numberInput < 0) {
                break;
            }
            
            numbers.add(numberInput);
        }
        
        numbers.stream()
              .filter(value -> value < 6)
              .forEach(value -> System.out.println(value));

    }
}
