import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

   private Flight flight1;
   private Flight flight2;
   private Flight flight3;

   @Before
    public void before(){
       flight1 = new Flight("GAT", "EDI","JA1445" );
   }

   @Test
    public void hasDestination() {
       assertEquals("GAT", flight1.getDestination());
   }

   @Test
   public void hasDepartureAirport() {
      assertEquals("EDI", flight1.getDepartureAirport());
   }

   @Test
   public void hasFlightNumber() {
      assertEquals("JA1445", flight1.getFlightNumber());
   }

}

//,"13:18","EDI"