/*
 * TO DO:
 *
 * Add robber functionality
 *
 * Add constraints to createTile(int, Terrain):
 * int between (inclusive) 0 (desert), 2-12
 * Terrain in enum
 */

abstract class Tile {

    public Tile() {
    }

    int tileID;


/*     A-aaa-B
 *    f       b
 *   f         b
 *  F           C
 *   e         c
 *    e       c
 *     E-ddd-D
 */

//    int[][] tileVertices;


    public Tile(int id) {
        tileID = id;
    }

    public int getID() {
        return tileID;
    }

    public String printTileID() {
        if (tileID > 9)
            return Integer.toString(tileID); //STRINGIFY
        else
            return (" " + tileID);
    }

    public void displayTile() {
        System.out.println("Tile: " + this.getID());
    }


    /*    public void testTile(int tokenTest, Terrain terrainTest) {
        System.out.println("TESTING TILES(int, enum)");
        Tile testTile = new Tile(tokenTest, terrainTest);
        testTile.displayTile();
        System.out.println("");
    }
*/
}
