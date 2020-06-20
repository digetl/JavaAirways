import java.util.ArrayList;

public class Flight {
    private String destination;
    private String departureAirport;
    private String flightNumber;
    private String departureTime;
    private Plane plane;
    private ArrayList<Passenger> bookedPassengers;


    public Flight(String destination, String departureAirport, String flightNumber, String departureTime, Plane plane){
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.plane = plane;
        this.bookedPassengers = new ArrayList<Passenger>();

    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int countPassengers(){
        return bookedPassengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getPlaneName() {
        return plane.getName();
    }

    public int getEmptySeats() {
        int emptySeats = getCapacityOfPlane() - bookedPassengers.size();
        return emptySeats;
    }

    public int getCapacityOfPlane() {
        return plane.getNumberOfSeats();
    }


    public void addPassenger(Passenger passenger) {
        bookedPassengers.add(passenger);
    }
}
