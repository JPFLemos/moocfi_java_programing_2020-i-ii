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
    
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            String number = scanner.nextLine();
            
            if (number.equals("end")) {
                break;
            }
            
            int num = Integer.valueOf(number);
            System.out.println(num * num * num);
        }
        
    }
}


