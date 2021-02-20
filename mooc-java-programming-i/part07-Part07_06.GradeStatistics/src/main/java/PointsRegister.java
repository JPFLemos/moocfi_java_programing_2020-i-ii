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

public class PointsRegister {

    private ArrayList<Integer> points;

    public PointsRegister() {
        this.points = new ArrayList<>();
    }

    public void addPoints(int points) {
        if (points >= 0 && points <= 100) {
            this.points.add(points);
        }
    }

    public int sumOfPoints() {
        int sum = 0;

        for (int point : this.points) {
            sum += point;
        }

        return sum;
    }

    public double avg() {
        if (this.points.size() > 0) {
            double avg = 1.0 * this.sumOfPoints() / this.points.size();

            return avg;
        }

        return -1;
    }

    public String avgPassing() {
        int sumOfPassingPoints = 0;
        int nOfPassingPoints = 0;
        int minimumToPass = 50;

        for (int point : this.points) {
            if (point >= minimumToPass) {
                sumOfPassingPoints += point;
                nOfPassingPoints++;
            }

        }

        if (nOfPassingPoints < 1) {
            return "-";
        }

        double avgPassing = 1.0 * sumOfPassingPoints / nOfPassingPoints++;
        return Double.toString(avgPassing);
    }

    public double passPercentage() {
        int nOfPassingPoints = 0;
        int minimumToPass = 50;

        for (int point : this.points) {
            if (point >= minimumToPass) {
                nOfPassingPoints++;
            }

        }

        double passPercentage = 100.0 * nOfPassingPoints / this.points.size();

        return passPercentage;
    }

}
