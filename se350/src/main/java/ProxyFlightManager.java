import java.util.Date;
public class ProxyFlightManager implements FlightManager{

        private static RealFlightManager manager;

        @Override
        public String createFlight(String type, Airline airline, int capacity, Airport origin, Airport destination, Date date) throws NullException, FormatException {
            System.out.println("A flight is being created.");
            manager = RealFlightManager.getInstance();
            String daflight = manager.createFlight(type, airline, capacity, origin, destination, date);
            return daflight;
        }

        @Override
        public Flight getFlightByNumber(String flightNum) {
            System.out.println("Flight Number: " + flightNum + " is being retrieved");
            Flight flight = null;
            manager = RealFlightManager.getInstance();
            try {
                flight = manager.getFlightByNumber(flightNum);
            } catch (NullException e) {
                System.out.println(e);
            }
            return flight;
        }

    }

