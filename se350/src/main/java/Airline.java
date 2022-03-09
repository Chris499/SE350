import java.util.Objects;
public class Airline {
    private String name;

    public Airline(String name) throws NullException, FormatException {
        SetName(name);
    }

    public String getName() {
        return name;
    }

    public void SetName(String TheName) throws NullException, FormatException {
        if (TheName == null) {
            throw new NullException("No null name");
        }
        if (TheName.length() > 8) {
            throw new FormatException("Name length exceeds max length");
        }
        name = TheName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Airline:", getName()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

