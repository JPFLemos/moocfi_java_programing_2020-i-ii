/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaop
 */
public class Hideout<T> {

    private T hiddenObject;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        this.hiddenObject = toHide;

    }

    public T takeFromHideout() {

        T hidden = this.hiddenObject;
        this.hiddenObject = null;

        return hidden;
    }

    public boolean isInHideout() {
        if (hiddenObject == null) {
            return false;
        }

        return true;
    }
}
