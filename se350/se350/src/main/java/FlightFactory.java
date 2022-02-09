import java.util.Date;
public class FlightFactory {
        private FlightFactory(){}
        public static CommercialFlight createFlight(String type, Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullException {
            if(type.equals("commercial"))
                return new CommercialFlight(airline, origin, destination,flightNumber, departureTime);
            else return null;
        }

    }
