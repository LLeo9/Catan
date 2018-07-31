public class Resources {

    public Resources() {
    }

    int brick;
    int wood;
    int ore;
    int grain;
    int sheep;

    public void setupDefaultBankResources() {
        brick = 19;
        wood = 19;
        ore = 19;
        grain = 19;
        sheep = 19;
    }

    public void displayAllResources() {
        System.out.println("Bricks: " + brick);
        System.out.println("Wood: " + wood);
        System.out.println("Ore: " + ore);
        System.out.println("Grain: " + grain);
        System.out.println("Sheep: " + sheep);
    }

    public void giveResource(Player player, Tile.Terrain terrain, int qty) {
        switch (terrain) {
            case BRICK:
                break;
            case WOOD:
                break;
            case ORE:
                break;
            case GRAIN:
                break;
            case SHEEP:
                break;
            case DESERT:
                break;
            default: System.out.println("Invalid resource " + terrain);

        }
    }

    public void testResources() {
        this.setupDefaultBankResources();
        this.giveResource(new Player(), Tile.Terrain.BRICK, 2);
    }
}
