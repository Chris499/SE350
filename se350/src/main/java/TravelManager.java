import java.util.Date;
public class TravelManager {

    public static void main(String[] args) {
        Date date = new Date("3/1/2021 5:30:00");

        Airline airline;
        Airport origin;
        Airport destination;

        try {

            FlightManager manager = new ProxyFlightManager();
            airline = AirlineFactory.getAirline("United");
            origin = AirportFactory.getAirport("ORD");
            destination = AirportFactory.getAirport("JFK");

            String createdPassengerFlight = manager.createFlight("Passenger", airline, 90, origin, destination, date);
            System.out.println(createdPassengerFlight);
            System.out.println("");

            Flight flight = manager.getFlightByNumber(createdPassengerFlight);
            System.out.println(flight);

        } catch (NullException | FormatException e) {
            System.out.println(e);
        }
    }

}