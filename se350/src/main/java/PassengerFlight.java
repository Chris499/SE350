import java.util.UUID;
import java.util.Date;
import java.util.Objects;
public class PassengerFlight implements Flight {

    private Date departureTime;
    private Airport destination;
    private Airport origin;
    private String flightNumber;
    private Airline airline;
    private int flightCapacity;

    public PassengerFlight(Airline airline, int capacity, Airport origin, Airport destination, Date departureTime) throws NullException, FormatException {
        setAirline(airline);
        setCapacity(capacity);
        setFlightNumber();
        setDepartureTime(departureTime);
        setOrigin(origin);
        setDestination(destination);
    }

    private void setAirline(Airline airline) throws NullException {
        if(airline == null) {
            throw new NullException("Airline cannot be null");
        }
        this.airline = airline;
    }
    private void setCapacity(int capacity) throws FormatException {
        if(capacity <= 0 || capacity > 1000) {
            throw new FormatException("This capacity is too much");
        }
        this.flightCapacity = capacity;
    }
    private void setFlightNumber() {
        String uuid = UUID.randomUUID().toString();
        this.flightNumber = uuid;
    }
    private void setOrigin(Airport origin) throws NullException {
        if(origin == null) {
            throw new NullException("Origin Airport cannot be null");
        }
        this.origin = origin;
    }
    private void setDestination(Airport destination) throws NullException {
        if(destination == null) {
            throw new NullException("Destination Airport cannot be null");
        }
        this.destination = destination;
    }

    private void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }


    public Airline getAirline() {
        return airline;
    }
    public Airport getOrigin() {
        return origin;
    }
    public Airport getDestination() {
        return destination;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public Date getDepartureTime() {
        return departureTime;
    }
    public int getFlightCapacity() {
        return flightCapacity;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getAirline(), getDepartureTime(), getDestination(), getFlightNumber(), getOrigin());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) { return false; }
        PassengerFlight flight = (PassengerFlight) o;
        return Objects.equals(getAirline(), flight.getAirline()) && Objects.equals( getDepartureTime(), flight. getDepartureTime())
                && Objects.equals(getDestination(), flight.getDestination()) && Objects.equals(getFlightNumber(), flight.getFlightNumber())
                && Objects.equals(getOrigin(), flight.getOrigin());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getAirline() + "\n");
        sb.append("Origin " + getOrigin() + "\n");
        sb.append("Destination " + getDestination() + "\n");
        sb.append("Flight Capacity: " + getFlightCapacity() + "\n");
        sb.append("Flight Number: " + getFlightNumber() + "\n");
        sb.append("Departure Time: " + getDepartureTime() + "\n");
        return sb.toString();
    }


}
