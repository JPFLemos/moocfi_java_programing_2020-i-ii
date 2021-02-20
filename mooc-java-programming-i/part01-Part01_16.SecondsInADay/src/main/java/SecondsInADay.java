
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int numOfDaysString = Integer.valueOf(scanner.nextLine());
        
        System.out.println(numOfDaysString * 86400);
        // Write your program here

    }
}
