
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
        return name;
}

public boolean equals(Object obj) {
        if (obj == null || (getClass() != obj.getClass())) {
            return false;
        }
        final Airport other = (Airport) obj;
        if(!getName().equals(other.getName())) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s", getName()));
        return sb.toString();
    }
}