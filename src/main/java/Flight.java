public class Flight {
    private String destination;
    private String departureAirport;

    public Flight(String destination, String departureAirport){
        this.destination = destination;
        this.departureAirport = departureAirport;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }
}
