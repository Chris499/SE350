import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight implements Flight {

    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origin, Airport destination, Date departureTime) throws NullException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime(departureTime);
    }


    private void setAirline(Airline airline) throws NullException {
        if(airline == null) {
            throw new NullException("Airline cannot be null");
        }
        this.airline = airline;
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
    private void setFlightNumber() {
        String uuid = UUID.randomUUID().toString();
        this.flightNumber = uuid;
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


    @Override
    public int hashCode() {
        return Objects.hash(getAirline(), getDepartureTime(), getDestination(), getFlightNumber(), getOrigin());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){ return false; }
        CommercialFlight flight = (CommercialFlight) o;
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
        sb.append("Flight Number: " + getFlightNumber() + "\n");
        sb.append("Departure Time: " + getDepartureTime() + "\n");
        return sb.toString();
    }


}