
import java.util.Random;

public class CityMap extends Map {
    private static final Random random = new Random();

    @Override
    public Tile createTile() {
        int type = random.nextInt(3); // Randomly select Road, Forest, or Building
        switch (type) {
            case 0: return new RoadTile();
            case 1: return new ForestTile();
            case 2: return new BuildingTile();
            default: return new RoadTile();
        }
    }
}
