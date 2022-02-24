import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class FlightManager {
    private static FlightManager ourInstance;


    public static FlightManager getInstance() throws NullException {
        if (ourInstance == null)
            ourInstance = new FlightManager();
        return ourInstance;
    }

    private FlightManager() {
    }

    static List<Flight> flights = new ArrayList();


    public static void createFlight() throws NullException, FormatException {
        Airline airline = new Airline("United");
        Airport depart = new Airport("ORD");
        Airport arrival = new Airport("JFK");

        flights.add(FlightFactory.createFlight("Passenger", airline, depart, arrival, "ORD9555", new Date(2022, 10, 10, 5, 00, 0)));
        flights.add(FlightFactory.createFlight("commercial", airline, depart, arrival, "ORD9000", new Date(2022, 12, 6, 4, 20, 4)));
        System.out.println(getFlightByNumber());

    }

    public static List<Flight> getFlightByNumber() {
        if (flights != null) {
            return flights;
        } else {
            throw new IllegalArgumentException("Airline name can not be null");
        }

    }

}