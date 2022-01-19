
import java.util.Date;

public class TravelManager {
    public static void main(String args[]) throws NullException, FormatException {

        Airline airliner = new Airline("United");
        Airport airportOrigin = new Airport("ORD");
        Airport airportDestination = new Airport("JFK");
        Date date = new Date();
        Flight flight = new Flight(airliner, airportOrigin, airportDestination, "203r", date);

        System.out.println(flight);
    }
}