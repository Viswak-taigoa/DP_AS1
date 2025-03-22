import java.util.Random;

public class WildernessMap extends Map {
    private static final Random random = new Random();

    @Override
    public Tile createTile() {
        int type = random.nextInt(3); // Randomly select Swamp, Water, or Forest
        switch (type) {
            case 0: return new SwampTile();
            case 1: return new WaterTile();
            case 2: return new ForestTile();
            default: return new SwampTile();
        }
    }
}
