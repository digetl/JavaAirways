import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {

   private Flight flight1;
   private Flight flight2;
   private Flight flight3;
   private Plane plane1;
   private Passenger passenger1;
   private Passenger passenger2;

   @Before
    public void before(){
      passenger1 = new Passenger("Dave Campbell", 0);
      passenger2 = new Passenger("Kirsty Campbell", 2);
      plane1 = new Plane("CS123", PlaneType.CESSNA);
      flight1 = new Flight("GAT", "EDI","JA1445", "13:18", plane1);
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

   @Test
   public void hasDepartureTime() {
      assertEquals("13:18", flight1.getDepartureTime());
   }

   @Test
   public void isEmptyToStart() {
      assertEquals(0, flight1.countPassengers());
   }

   @Test
   public void hasAPlaneAssigned(){
      assertEquals(plane1, flight1.getPlane());
   }

   @Test
   public void hasPlaneName() {
//      assertEquals("CS123", plane1.getName());
//      assertEquals("CS123", flight1.getPlane().getName());
      assertEquals("CS123", flight1.getPlaneName());
   }
//
   @Test
   public void canAddPassenger() {
      flight1.addPassenger(passenger1);
      assertEquals(2, flight1.getEmptySeats());
   }


}