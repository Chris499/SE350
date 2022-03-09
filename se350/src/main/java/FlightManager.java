import java.util.Date;

public interface FlightManager {
    String createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date) throws NullException, FormatException;
    Flight getFlightByNumber(String flightNum);
}