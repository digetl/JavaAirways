import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;

    @Before
    public void before() {
        passenger1 = new Passenger("Dave Campbell", 0);
        passenger2 = new Passenger("Kirsty Campbell", 2);
    }

    @Test
    public void hasName() {
    assertEquals("Dave Campbell", passenger1.getName());
    }

    @Test
    public void checkForBaggage__None() {
        assertEquals(0, passenger1.getBaggage());
    }

    @Test
    public void checkForBaggage__Two() {
        assertEquals(2, passenger2.getBaggage());
    }
}
