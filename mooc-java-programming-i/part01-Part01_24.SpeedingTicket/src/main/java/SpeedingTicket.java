
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int speedLimit = 120;

        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        if (speed > speedLimit) {
            System.out.println("Speeding ticket!");
        }
    }
}
