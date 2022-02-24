import java.util.Date;
public class FlightFactory {
        private FlightFactory(){}
        public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullException, FormatException {
            if(type.equals("commercial"))
                return new CommercialFlight(airline, origin, destination,flightNumber, departureTime);
            else if(type.equals("Passenger"))
                return new PassengerFlight(airline, origin, destination, flightNumber);
            else return null;
        }
}
