import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Dave Campbell");
    }

    @Test
    public void hasName() {
    assertEquals("Dave Campbell", passenger.getName());
    }

}
