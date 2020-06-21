import java.util.ArrayList;

public class FlightManager {
    private int baggageWeightPerPassenger;
    private Flight flight;
    private String destination;
    private String departureAirport;
    private String flightNumber;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> bookedPassengers;




    public int getBaggageWeightPerPassenger() {

        return flight.getCapacityOfPlane() / flight.countPassengers();
    }


}
