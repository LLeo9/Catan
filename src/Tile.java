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
    Coordinates tileCoords = new Coordinates();


//    Coordinates[] vertices = new Coordinates[6];

/*     A-aaa-B
 *    f       b
 *   f         b
 *  F           C
 *   e         c
 *    e       c
 *     E-ddd-D
 *  VERTICES NEED TO BE TWO CHARS WIDE?? BC CITIES
 */

/* NW
 * NE
 * E
 * SE
 * SW
 * W
 */

    public Tile(int id) {
        tileID = id;
    }

    public void setTileCoords(Coordinates coords) {
        tileCoords = coords;
    }

    public void setID(int id) {
        tileID = id;
    }

    public int getID() {
        return tileID;
    }

/*    public void setVertices(int xA, int yA, int xB, int yB, int xC, int yC, int xD, int yD, int xE, int yE, int xF, int yF) {
        for (int v = 0; v < 6; v++) {
            vertices[v] = new Coordinates();
        }

        vertices[0].setXY(xA, yA);
        vertices[1].setXY(xB, yB);
        vertices[2].setXY(xC, yC);
        vertices[3].setXY(xD, yD);
        vertices[4].setXY(xE, yE);
        vertices[5].setXY(xF, yF);

    }

    public void printVertices() {
        for (int v = 0; v < 6; v++) {
            System.out.println("Vertex " + v + ": " + vertices[v].getCoordinates());
        }
    }
*/
    public String printTileID() {
        if (tileID > 9)
            return Integer.toString(tileID); //STRINGIFY
        else
            return (" " + tileID);
    }

    public void displayTile() {
        System.out.println("Tile ID: " + this.printTileID());
        System.out.println("Tile Coordinates: " + this.tileCoords.getCoordinates());
    }

    public void testTile() {
        System.out.println("TESTING TILE");
        this.setID(9);
        this.setTileCoords(new Coordinates(1,-3));
        this.displayTile();
    }

}
