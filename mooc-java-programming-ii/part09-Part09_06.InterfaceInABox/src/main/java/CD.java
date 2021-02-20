/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class CD implements Packable {

    private String artistName;
    private String cdName;
    private int pubYear;

    public CD(String artistName, String cdName, int pubYear) {
        this.artistName = artistName;
        this.cdName = cdName;
        this.pubYear = pubYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return this.artistName + ": " + this.cdName + " (" + this.pubYear + ")";
    }
    
    

}
