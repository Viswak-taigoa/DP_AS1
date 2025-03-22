

public class Game {
    public static void main(String[] args) {
        // Create a random map type (CityMap or WildernessMap)
        Map map = createMap("City"); // Change to "Wilderness" for a different map
        map.display();
    }

    public static Map createMap(String type) {
        if (type.equalsIgnoreCase("City")) {
            return new CityMap();
        } else if (type.equalsIgnoreCase("Wilderness")) {
            return new WildernessMap();
        }
        throw new IllegalArgumentException("Unknown map type: " + type);
    }
}
