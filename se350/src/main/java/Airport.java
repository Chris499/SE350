
import java.util.Objects;

public class Airport {
    private String name;

    public Airport(String name) throws NullException, FormatException {
        SetName(name);
    }
    private boolean AllCap(String Name){
        for (int i = 0; i < Name.length(); i++) {
            if (Character.isLowerCase(Name.charAt(i))){
                return false; }
        }
        return true;
    }

    private void SetName(String Aname) throws NullException, FormatException {
        if (Aname == null){
            throw new NullException("No airport name");
        }
        if (AllCap(Aname) ==false){
            throw new FormatException("Airport must be all cap");
        }
        if (Aname.length() != 3){
            throw new FormatException("Airport must have a length of 3 char");
        }
        name = Aname;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Airport other = (Airport) obj;
        return Objects.equals(getName(), other.getName());
    }


    @Override
    public String toString() {
        return "Airport Name: " + getName();
    }

}