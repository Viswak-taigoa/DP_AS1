

public abstract class Map {
    protected static final int WIDTH = 5;
    protected static final int HEIGHT = 5;
    protected Tile[][] tiles = new Tile[HEIGHT][WIDTH];

    public Map() {
        generateMap();
    }

    private void generateMap() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public abstract Tile createTile();

    public void display() {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
