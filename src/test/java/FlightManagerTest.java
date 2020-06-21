import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    private Flight flight1;
    private Plane plane1;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    @Before
    public void before(){
        passenger1 = new Passenger("Dave Campbell", 0);
        passenger2 = new Passenger("Kirsty Campbell", 2);
        passenger3 = new Passenger("Ken Campbell", 0);
        passenger4 = new Passenger("Avril Campbell", 2);
        plane1 = new Plane("CS123", PlaneType.CESSNA);
        flight1 = new Flight("GAT", "EDI","JA1445", "13:18", plane1);
    }


    @Test
    public void checkTotalNumberOfBagsOnFlight() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        assertEquals(2, flight1.getNumberOfBagsLoaded());
    }


}