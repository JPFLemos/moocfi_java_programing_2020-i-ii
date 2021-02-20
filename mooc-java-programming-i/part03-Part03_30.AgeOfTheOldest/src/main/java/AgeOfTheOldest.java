
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestage = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] nameAge = input.split(",");
            int age = Integer.valueOf(nameAge[1]);
            if (oldestage < age) {
                oldestage = age;
            }            
        }
        System.out.println("Age of the oldest: " + oldestage);


    }
}
