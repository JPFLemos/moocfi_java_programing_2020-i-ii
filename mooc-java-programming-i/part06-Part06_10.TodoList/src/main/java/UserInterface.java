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

    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if(command.equals("remove")) {
            remove();
        } else {
            System.out.println("Command Unknown");
        }

    }

    public void add() {

        System.out.println("To add:");
        String toBeAdded = scanner.nextLine();

        toDoList.add(toBeAdded);
    }
    
    public void list() {
        toDoList.print();
        
    }
        
    public void remove() {
        System.out.println("Which one is removed?");
        int toBeRemoved = Integer.valueOf(scanner.nextLine());
        toDoList.remove(toBeRemoved);
    }

}
