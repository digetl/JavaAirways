public class Flight {
    private String destination;
    private String departureAirport;
    private String flightNumber;

    public Flight(String destination, String departureAirport, String flightNumber){
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.flightNumber = flightNumber;
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
}
