/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable {

    private List<Movable> orgInTheHerd;

    public Herd() {
        this.orgInTheHerd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.orgInTheHerd.add(movable);
    }

    @Override
    public String toString() {
        String positionOfOrgs = "";
        for (Movable mov : this.orgInTheHerd) {
            positionOfOrgs += mov.toString() + "\n";
        }
        return positionOfOrgs;
    }
    

    @Override
    public void move(int dx, int dy) {
        for (Movable mov : this.orgInTheHerd) {
            mov.move(dx, dy);
        }
    }

}
