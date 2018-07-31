/*
 * TO DO:
 *
 * Add robber functionality
 *
 * Add constraints to createTile(int, Terrain):
 * int between (inclusive) 0 (desert), 2-12
 * Terrain in enum
 */

public class TerrainTile extends Tile {

    public enum Terrain {
        BRICK, WOOD, ORE, GRAIN, SHEEP, DESERT
    }

    Terrain terr;
    int numToken = 0;
    boolean robber = false;


/***** Instantiators *****/

    public TerrainTile() { }

    public TerrainTile(int id, int token, Terrain terrain) {
        tileID = id;
        numToken = token;
        terr = terrain;
    }

    public TerrainTile(int id, int token, Terrain terrain, boolean rob) {
        tileID = id;
        numToken = token;
        terr = terrain;
        robber = rob;
    }


/***** Gets *****/

    public int getToken() {
        return numToken;
    }

    public Terrain getTerrain() {
        return terr;
    }

    public boolean hasRobber() {
        return robber;
    }


/***** Prints *****/

    public String printToken() {
        if (getToken() > 9)
            return Integer.toString(numToken); //STRINGIFY
        else
            return (" " + numToken);
    }

    public String printTerrain() {
        return (terr.toString().toLowerCase());
    }

    public void displayTile() {
        System.out.println("TerrainTile: " + this.printTileID() + " " + this.printToken() + " " + this.printTerrain() + " " + this.hasRobber());
    }

    public void testTerrainTile(int id, int tokenTest, Terrain terrainTest) {
        System.out.println("TESTING TERRTAINTILES(int, enum, boolean)");
        TerrainTile testTerrainTile = new TerrainTile(id, tokenTest, terrainTest);
        testTerrainTile.displayTile();
        System.out.println("");
    }

}
