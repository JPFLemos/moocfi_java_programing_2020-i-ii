/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Person implements Saveable {

    private String name;
    private String address;

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void load(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
