
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String valueOfString = scan.nextLine();
        System.out.println("Give an integer:");
        int valueOfInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valueOfDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean valueOfBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + valueOfString);
        System.out.println("You gave the integer " + valueOfInt);
        System.out.println("You gave the double " + valueOfDouble);
        System.out.println("You gave the boolean " + valueOfBoolean);
        
        // Write your program here

    }
}
