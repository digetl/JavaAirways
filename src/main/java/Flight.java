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
        return getCapacityOfPlane() - bookedPassengers.size();
    }

    public int getCapacityOfPlane() {
        return plane.getNumberOfSeats();
    }

    public boolean addPassenger(Passenger passenger) {
        if (getCapacityOfPlane() == bookedPassengers.size())
            return false;
        else
            bookedPassengers.add(passenger);
            return true;
    }

    public int getNumberOfBagsLoaded() {
        int numberOfBagsLoaded = 0;
//        bookedPassengers.forEach(passenger -> );

        for (int i = 0; i < bookedPassengers.size(); i++) {
            numberOfBagsLoaded += bookedPassengers.get(i).getBaggage();
//            System.out.println(bookedPassengers.get(i));
        }

        return numberOfBagsLoaded;
    }

}
