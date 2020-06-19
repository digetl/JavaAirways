public class Flight {
    private String destination;
    private String departureAirport;
    private String flightNumber;
    private String departureTime;

    public Flight(String destination, String departureAirport, String flightNumber, String departureTime){
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
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
}
