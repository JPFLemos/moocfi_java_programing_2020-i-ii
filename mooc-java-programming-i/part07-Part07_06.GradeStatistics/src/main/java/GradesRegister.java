/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.ArrayList;

public class GradesRegister {
    
    private ArrayList<Integer> grades;
    
    public GradesRegister() {
        this.grades = new ArrayList<>();
    }
    
    public void addGrade(int points) {
        if (points >= 0 && points <= 100){
            this.grades.add(pointsToGrade(points));
        }
    }
    
    public int numberOfGrades(int grade){
        int count = 0;
        for (int iGrade : this.grades) {
            if (iGrade == grade) {
                count++;
            }
        }
        
        return count;
    }
    
    public int pointsToGrade(int points) {
        
        int grade = 0;
        
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        
        return grade;
    }
}
