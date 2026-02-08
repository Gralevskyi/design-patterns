package com.hralievsky.learning.design.patterns.behavioral.mediator;


import com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft.Aircraft;
import com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft.Airplane;
import com.hralievsky.learning.design.patterns.behavioral.mediator.aircraft.Helicopter;
import com.hralievsky.learning.design.patterns.behavioral.mediator.tower.AirportTower;
import com.hralievsky.learning.design.patterns.behavioral.mediator.tower.Tower;

/**
 * Airport Control Tower System
 * <p>
 * <p>
 * Context:You are building an air traffic control system where aircraft communicate through a central control tower rather than directly with each other.
 * <p>
 * Requirements:
 * <p>
 * 1. Aircraft: Simple class with a callsign (e.g., "Flight-747")
 * - Can send messages to the tower
 * - Can receive messages from the tower
 * 2. Mediator Interface (ControlTower):
 * - registerAircraft(aircraft) - add aircraft to tower
 * - sendMessage(message, fromAircraft) - route messages
 * 3. Concrete Mediator (AirportControlTower):
 * - Maintains list of registered aircraft
 * - Broadcasts messages from one aircraft to all others
 * 4. Demonstration:
 * - Create a control tower
 * - Register 3 aircraft
 * - Each aircraft sends a message through the tower
 * - Show messages being delivered to other aircraft
 */
public class Bootstrap {
    public static void main(String[] args) {
        Tower tower = new AirportTower();
        Aircraft helicopter = new Helicopter("Helicopter 1");
        Aircraft planeOne = new Airplane("Flight-747");
        Aircraft planeTwo = new Airplane("Flight-656");

        tower.registerAircraft(helicopter);
        tower.registerAircraft(planeOne);
        tower.registerAircraft(planeTwo);

        helicopter.sendMessage("Can I take off?");
        planeOne.sendMessage("Can I land?");
        planeTwo.sendMessage("Can I change direction?");

    }
}
