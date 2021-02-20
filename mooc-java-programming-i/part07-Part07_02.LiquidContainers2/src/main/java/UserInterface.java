/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.first = new Container();
        this.second = new Container();
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("First: " + this.first.contains() + "/100");
            System.out.println("Second: " + this.second.contains() + "/100");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                this.first.add(amount);
            }

            if (command.equals("move")) {
                if (this.first.contains() > amount) {
                    this.first.remove(amount);
                    this.second.add(amount);
                } else {
                    this.second.add(this.first.contains());
                    this.first.remove(amount);
                }
            }

            if (command.equals("remove")) {
                this.second.remove(amount);
            }

            System.out.println("");

        }
    }

}
