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

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("Command:");
            String cmd = scanner.nextLine();
            
            if (cmd.equals("stop")) {
                break;
            }
            
            processCommand(cmd);
        }
    }
    
    public void processCommand(String cmd) {
        if (cmd.equals("add")) {
            System.out.println("To add:");
            String task = scanner.nextLine();
            
            this.list.add(task);
        }
        
        if (cmd.equals("list")) {
            this.list.print();
        }
        
        if (cmd.equals("remove")){
            System.out.println("Which one is removed?");
            int number = Integer.valueOf(scanner.nextLine());
            
            this.list.remove(number);
        }
    }
}
