
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int maxOne = 100;
        int maxTwo = 100;
        while (true) {
            System.out.println("First: " + first + "/" + maxOne);
            System.out.println("Second " + second + "/" + maxTwo);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (amount > 0) {
                if (command.equals("add")) {
                    first += amount;
                    if (first > maxOne) {
                        first = maxOne;
                    }
                }

                if (command.equals("move")) {
                    if (first - amount >= 0) {
                        first -= amount;
                        second += amount;
                    } else if (first - amount < 0) {
                        second += first;
                        first = 0;
                    }
                    
                    if (second > maxOne) {
                        second = maxOne;
                    }
                }

                if (command.equals("remove")) {
                    if (second - amount > 0) {
                        second -= amount;
                    } else if (second - amount < 0) {
                        second = 0;
                    }
                }
            }
        }
    }

}
