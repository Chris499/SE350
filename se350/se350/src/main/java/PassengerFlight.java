import java.util.Objects;

public class PassengerFlight implements Flight {
    // implements Flight
    private Airline airlineN;
    private Airport origin;
    private Airport destination;
    private String flightNumber;

    // constructor
    public PassengerFlight(Airline airlineN, Airport origin, Airport destination, String flightNumber) throws NullException, FormatException {
        setFlightAirline(airlineN);
        setFlightOrigin(origin);
        setFlightDestination(destination);
        setFlightNumber(flightNumber);
    }


    private void setFlightNumber(String currentFlightNumber) throws NullException {
        if (currentFlightNumber == null) {
            throw new NullException("Null value passed in for setFlightNumber");
        }
        flightNumber = currentFlightNumber;
    }


    private void setFlightDestination(Airport flightDestination) throws NullException {
        if (flightDestination == null) {
            throw new NullException("Null value passed in for setFlightDestination");
        }
        destination = flightDestination;
    }

    private void setFlightOrigin(Airport flightOrigin) throws NullException  {
        if (flightOrigin == null) {
            throw new NullException("Null value passed in for setFlightOrigin");
        }
        origin = flightOrigin;
    }

    private void setFlightAirline(Airline flightAirline) throws NullException {
        if (flightAirline == null) {
            throw new NullException("Null value passed in for setFlightAirline");
        }
        airlineN = flightAirline;
    }

    // getters
    public String getFlightNumber() {return flightNumber;}
    public Airport getFlightDestination() {return destination;}
    public Airport getFlightOrigin() {return origin;}
    public Airline getFlightAirline() {return airlineN;}


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final CommercialFlight other = (CommercialFlight) o;
        if (airlineN.equals(other.getAirline())) {
            return false;
        }
        if (origin.equals(other.getOrigin())) {
            return false;
        }
        if (destination.equals(other.getDestination())) {
            return false;
        }
        if (flightNumber.equals(other.getFlightNumber())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineN, origin, destination, flightNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "flight.Flight airline.Airline Name:", getFlightAirline()));
        sb.append(String.format("%-20s %s%n", "flight.Flight Number:", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "flight.Flight origin:", getFlightOrigin()));
        sb.append(String.format("%-20s %s%n", "flight.Flight destination:", getFlightDestination()));

        return sb.toString();
    }
}