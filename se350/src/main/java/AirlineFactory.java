import java.util.HashMap;
import java.util.Map;
    public class AirlineFactory {
        private static Map<String, Airline> airlineCache = new HashMap<>();

        private AirlineFactory() {}

        public static Airline getAirline(String name) {
            return airlineCache.computeIfAbsent(name, newName -> {
                try {
                    return new Airline(name);
                } catch (NullException | FormatException e) {
                    System.out.println(e);
                }
                return null;
            });
        }
    }