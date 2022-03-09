import java.util.Date;

    public class FlightFactory {
        private FlightFactory() {
        }

        public static Flight createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination,Date date) throws FormatException, NullException {
            if (type.equals("Commercial"))
                return new CommercialFlight(airline,origin,destination,date);
            else if(type.equals("Passenger"))
                return new PassengerFlight(airline,capacity,origin,destination,date);
            else return null;
        }
    }

