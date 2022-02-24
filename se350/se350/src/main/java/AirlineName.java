import java.util.Objects;

public class AirlineName {

    // initialize variable name, type String
    private String airlineName;


    // constructor
    public AirlineName(String name) throws NullException, FormatException {
        setAirlineName(name);
    }

    // setter
    private void setAirlineName(String alName) throws NullException, FormatException {
        if (alName == null) {
            throw new NullException("Null value passed in for setAirportName");
        }
        if (alName.length() > 8) {
            throw new FormatException("Invalid name passed in for airlineName " + alName);
        }
        airlineName = alName;
    }

    // getter
    public String getAirlineName() {
        return airlineName;
    }


    //equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirlineName airline = (AirlineName) o;
        return Objects.equals(airlineName, airline.airlineName);
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(airlineName);
    }

    // toString() method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "airline.Airline Name:", getAirlineName()));
        return sb.toString();
    }
}
