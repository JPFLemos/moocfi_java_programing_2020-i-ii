/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.domain;

/**
 *
 * @author joaop
 */
import FlightControl.domain.Plane;
import FlightControl.domain.Place;

public class Flight {
    
    private Place departure;
    private Place destination;
    private Plane plane;

    public Flight(Place departure, Place destination, Plane plane) {
        this.departure = departure;
        this.destination = destination;
        this.plane = plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Place getDestination() {
        return destination;
    }

    public Plane getPlane() {
        return plane;
    }

    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.departure + "-" + this.destination + ")";
    }
    
    
}
