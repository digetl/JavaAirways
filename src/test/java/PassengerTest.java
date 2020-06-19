import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Dave Campbell", 0);
        passenger = new Passenger("Kirsty Campbell", 2);
    }

    @Test
    public void hasName() {
    assertEquals("Dave Campbell", passenger.getName());
    }

    @Test
    public void checkForBaggage__None() {
        assertEquals(2, passenger.getBaggage());
    }

}
