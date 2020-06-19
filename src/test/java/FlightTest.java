import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

   private Flight flight1;
   private Flight flight2;
   private Flight flight3;

   @Before
    public void before(){
       flight1 = new Flight("GAT", "JA1445","13:18","EDI");
   }

   @Test
    public void hasDestination() {
       assertEquals("GAT", flight1.getDestination());
   }

}
