/*
 * TO DO:
 *
 * Add robber functionality
 *
 * Add constraints to createTile(int, Terrain):
 * int between (inclusive) 0 (desert), 2-12
 * Terrain in enum
 */

public class TerrainTile {

    public enum Terrain {
        BRICK, WOOD, ORE, GRAIN, SHEEP, DESERT
    }

    int tileID;
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

    //CREATE TERRAIN TILE (with robber passed in)
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

    public void displayTile() {
        System.out.println("TerrainTile: " + this.printToken() + " " + this.getTerrain() + " " + this.hasRobber());
    }

    public void testTerrainTile(int id, int tokenTest, Terrain terrainTest) {
        System.out.println("TESTING TERRTAINTILES(int, enum, boolean)");
        TerrainTile testTile = new TerrainTile(id, tokenTest, terrainTest);
        testTile.displayTile();
        System.out.println("");
    }

}
