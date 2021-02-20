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

    private PointsRegister pointsSystem;
    private GradesRegister gradesSystem;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.pointsSystem = new PointsRegister();
        this.scanner = scanner;
        this.gradesSystem = new GradesRegister();
    }

    public void start() {
        System.out.println("Enter points totals, -1 stops:");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }
            this.pointsSystem.addPoints(input);
            this.gradesSystem.addGrade(input);
        }

        System.out.println("Point average (all): " + this.pointsSystem.avg());
        System.out.println("Point average (passing): " + this.pointsSystem.avgPassing());
        System.out.println("Pass percentage: " + this.pointsSystem.passPercentage());

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            int stars = gradesSystem.numberOfGrades(i);
            System.out.print(i + ": ");
            while (stars > 0) {
                System.out.print("*");
                stars--;
            }
            System.out.println("");

        }
    }

}
