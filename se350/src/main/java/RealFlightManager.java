
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class RealFlightManager {
    private static RealFlightManager flightInstance;
    private static List<Flight> flights;

    public static RealFlightManager getInstance() {
        if (flightInstance == null) {
            flightInstance = new RealFlightManager();
            flights = new ArrayList<>();
        }
        return flightInstance;
    }

    private RealFlightManager() {

    }
    public String createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date) throws NullException, FormatException {
        Flight flight = FlightFactory.createFlight(type, airline, capacity, origin, destination, date);
        flights.add(flight);
        return flight.getFlightNumber();
    }

    public Flight getFlightByNumber(String flightNum) throws NullException {
        Flight flight = null;
        for(Flight fl : flights) {
            if(fl.getFlightNumber().equals(flightNum)) {
                flight = fl;
            }
        }
        if(flight == null) {
            throw new NullException("No Flight has this number");
        }
        return flight;
    }

}