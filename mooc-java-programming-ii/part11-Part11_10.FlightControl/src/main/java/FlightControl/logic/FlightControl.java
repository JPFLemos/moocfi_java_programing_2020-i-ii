/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.logic;

/**
 *
 * @author joaop
 */
import java.util.Map;
import java.util.HashMap;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import FlightControl.domain.Plane;
import java.util.Collection;

public class FlightControl {

    private Map<String, Plane> airplanes;
    private Map<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Plane plane = new Plane(ID, capacity);
        this.airplanes.put(ID, plane);

    }

    public void addFlight(Plane plane, String departureID, String destinationID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(this.places.get(departureID), this.places.get(destinationID), plane);

        this.flights.put(flight.toString(), flight);

    }

    public Collection<Plane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Plane getPlane(String ID) {
        return this.airplanes.get(ID);
    }
}
