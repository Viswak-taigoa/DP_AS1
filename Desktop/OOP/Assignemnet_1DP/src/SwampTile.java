public class SwampTile extends Tile {
    @Override
    public char getCharacter() {
        return 'S';
    }

    @Override
    public String getType() {
        return "Swamp";
    }

    @Override
    public void action() {
        System.out.println("You wade through the swamp, slowing your movement.");
    }
}
