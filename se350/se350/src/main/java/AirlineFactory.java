import java.util.HashMap;
import java.util.Map;

public class AirlineFactory {
    private static Map<String, Airline> airlineCache = new HashMap<>();

    private AirlineFactory() {}

    public static Airline getAirline(String name) throws NullException {
        return airlineCache.computeIfAbsent(name, newName -> {
            try {
                return new Airline(name);
            } catch (FormatException | NullException e) {
                System.out.println(e);
            }
            return null;
        });
    }
}
