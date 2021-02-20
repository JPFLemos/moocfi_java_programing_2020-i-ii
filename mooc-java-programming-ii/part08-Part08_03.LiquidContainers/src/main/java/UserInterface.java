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

    private LiquidContainer containerOne;
    private LiquidContainer containerTwo;
    private Scanner scanner;

    public UserInterface(int maxOne, int maxTwo, Scanner scanner) {
        this.containerOne = new LiquidContainer(maxOne);
        this.containerTwo = new LiquidContainer(maxTwo);
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("First: " + containerOne);
            System.out.println("Second: " + containerTwo);

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (amount < 0) {
                System.out.println("");
                continue;
            }

            processCommand(command, amount);
            System.out.println("");
        }

    }

    public void processCommand(String cmd, int amount) {
        if (cmd.equals("add")) {
            addAmount(amount);
        }

        if (cmd.equals("move")) {
            moveAmount(amount);
        }
        
        if (cmd.equals("remove")) {
            remove(amount);
        }
    }

    public void addAmount(int amount) {
        containerOne.addLiquid(amount);
    }

    public void moveAmount(int amount) {
        if (containerOne.getContain() < amount) {
            amount = containerOne.getContain();
        }

        containerTwo.addLiquid(amount);
        containerOne.removeLiquid(amount);

    }
    
    public void remove(int amount) {
        if (containerTwo.getContain() < amount) {
            amount = containerTwo.getContain();
        }
        
        containerTwo.removeLiquid(amount);
    }

}
