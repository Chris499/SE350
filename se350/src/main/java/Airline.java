import java.util.Objects;
public class Airline {
    private String name;
    public Airline(String name) throws NullException, FormatException {
        SetName(name);
    }
    public String getName(){
        return name;
    }
    public void SetName(String TheName) throws NullException, FormatException{
        if(TheName == null) {
            throw new NullException("Null argument used in setName");
    }
        if(TheName.length() > 8){
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
    public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airline other = (Airline) obj;
        if (!getName().equals(other.getName())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

}

