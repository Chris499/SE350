import java.util.HashMap;
import java.util.Map;

public class AirportFactory {
    private static Map<String, Airport> airportCache = new HashMap<>();

    public static Airport getAirport(String name) {
        return airportCache.computeIfAbsent(name, newName -> {
            try {
                try {
                    return new Airport(name);
                } catch (FormatException e) {
                    e.printStackTrace();
                }
            } catch ( NullException e) {
                System.out.println(e);
            }
            return null;
        });
    }

}