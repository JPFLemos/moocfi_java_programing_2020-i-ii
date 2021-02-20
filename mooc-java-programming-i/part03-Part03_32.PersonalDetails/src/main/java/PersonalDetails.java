
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int n = 0;
        int longest = 0;
        String longestName = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] nameYear = input.split(",");
            sum = sum + Integer.valueOf(nameYear[1]);
            n++;
            if (longest < nameYear[0].length()) {
                longest = nameYear[0].length();
                longestName = nameYear[0];
            }
        }
        
        double avg = 1.0 * sum / n;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + avg);
        


    }
}
