
public class WaterTile extends Tile {
    @Override
    public char getCharacter() {
        return 'W';
    }

    @Override
    public String getType() {
        return "Water";
    }

    @Override
    public void action() {
        System.out.println("You swim across the water.");
    }
}
