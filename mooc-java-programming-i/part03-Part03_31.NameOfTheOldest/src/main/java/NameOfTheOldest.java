
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldestAge = 0;
        String nameOfOldest = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] nameAge = input.split(",");
            int age = Integer.valueOf(nameAge[1]);
            if (oldestAge < age) {
                oldestAge = age;
                nameOfOldest = nameAge[0];
            }
        }
        System.out.println("Name of the oldest: " + nameOfOldest);


    }
}
