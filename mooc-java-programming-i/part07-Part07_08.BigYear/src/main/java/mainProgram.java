
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        Database db = new Database();

        while (true) {
            System.out.println("?");
            String cmd = scan.nextLine();

            if (cmd.equalsIgnoreCase("quit")) {
                break;
            }

            if (cmd.equalsIgnoreCase("add")) {
                System.out.println("Name:");
                String name = scan.nextLine();

                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();

                db.addBird(name, latinName);
            }

            if (cmd.equalsIgnoreCase("observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                db.observation(bird);
            }

            if (cmd.equalsIgnoreCase("one")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                db.printOne(bird);
            }

            if (cmd.equalsIgnoreCase("all")) {
                db.printAll();
            }
        }

    }

}
