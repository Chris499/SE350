import java.util.Date;

import java.util.Objects;

public class CommercialFlight implements Flight {
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origin, Airport destination, String flightNumber, Date departureTime) throws NullException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber(flightNumber);
        setDepartureTime(departureTime);
    }


    public Airline getAirline(){
        return airline;
    }
    public void setAirline(Airline TheLine) throws NullException{
        if (TheLine == null){
            throw new NullException("Null value for setAirline");
        }
        airline = TheLine;
    }
    public void setFlightNumber(String aFlightNumber)throws IllegalArgumentException  {
        if (aFlightNumber == null){
            throw new IllegalArgumentException("A flight number can not be null");
        }
        flightNumber = aFlightNumber;
    }

    public Airport getDestination(){
        return destination;
    }

    public String getFlightNumber(){
        return flightNumber;
    }

    public Date getDepartureTime(){
        return departureTime;
    }

    private void setOrigin (Airport originLoc){
        origin = originLoc;
    }
    public Airport getOrigin(){
        return origin;
    }

    private void setDestination(Airport destinationLoc){
        destination = destinationLoc;
    }


    private void setDepartureTime (Date dTime) {
        departureTime = dTime;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline", getAirline()));
        sb.append(String.format("%-20s %s%n", "Origin", getOrigin()));
        sb.append(String.format("%-20s %s%n", "Destination", getDestination()));
        sb.append(String.format("%-20s %s%n", "FLight Number", getFlightNumber()));
        sb.append(String.format("%-20s %s%n", "Departure Time", getDepartureTime()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final CommercialFlight other = (CommercialFlight) o;
        if (getAirline().equals(other.getAirline())) {
            return false;
        }
        if (getOrigin().equals(other.getOrigin())) {
            return false;
        }
        if (getDestination().equals(other.getDestination())) {
            return false;
        }
        if (getFlightNumber().equals(other.getFlightNumber())) {
            return false;
        }
        if (getDepartureTime().equals(other.getDepartureTime())) {
            return false;
        }

        return true;
    }


    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

}