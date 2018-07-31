/*
 * TO DO:
 *
 * displayColorAsciiBoard()
 *
 * createRandomBoard()
 *
 */

import java.io.FileReader;
import java.io.BufferedReader;

public class Board {

    public Board() {
    }

    char[][] boardMap = new char[67][43];
    TerrainTile boardTerrainTile[] = new TerrainTile[19];
    Resources resources = new Resources();

    private void createDefaultMapFromBaseFile() throws Exception {

        //create static chars

        BufferedReader br = new BufferedReader(new FileReader("catanAsciiMap.txt"));

        int reader = 0;

        for (int i=0; i<43; i++) {
            for (int j=0; j<67; j++){
                reader = br.read();
                boardMap[j][i] = (char)reader;
            }
        }
        br.close();

    }

    private void createDefaultTerrainTiles() {
        boardTerrainTile[0] = new TerrainTile(0, 10, TerrainTile.Terrain.ORE);
        boardTerrainTile[1] = new TerrainTile(1, 2, TerrainTile.Terrain.SHEEP);
        boardTerrainTile[2] = new TerrainTile(2, 9, TerrainTile.Terrain.WOOD);
        boardTerrainTile[3] = new TerrainTile(3, 12, TerrainTile.Terrain.GRAIN);
        boardTerrainTile[4] = new TerrainTile(4, 6, TerrainTile.Terrain.BRICK);
        boardTerrainTile[5] = new TerrainTile(5, 4, TerrainTile.Terrain.SHEEP);
        boardTerrainTile[6] = new TerrainTile(6, 10, TerrainTile.Terrain.BRICK);
        boardTerrainTile[7] = new TerrainTile(7, 9, TerrainTile.Terrain.GRAIN);
        boardTerrainTile[8] = new TerrainTile(8, 11, TerrainTile.Terrain.WOOD);
        boardTerrainTile[9] = new TerrainTile(9, 0, TerrainTile.Terrain.DESERT, true);
        boardTerrainTile[10] = new TerrainTile(10, 3, TerrainTile.Terrain.WOOD);
        boardTerrainTile[11] = new TerrainTile(11, 8, TerrainTile.Terrain.ORE);
        boardTerrainTile[12] = new TerrainTile(12, 8, TerrainTile.Terrain.WOOD);
        boardTerrainTile[13] = new TerrainTile(13, 3, TerrainTile.Terrain.ORE);
        boardTerrainTile[14] = new TerrainTile(14, 4, TerrainTile.Terrain.GRAIN);
        boardTerrainTile[15] = new TerrainTile(15, 5, TerrainTile.Terrain.SHEEP);
        boardTerrainTile[16] = new TerrainTile(16, 5, TerrainTile.Terrain.BRICK);
        boardTerrainTile[17] = new TerrainTile(17, 6, TerrainTile.Terrain.GRAIN);
        boardTerrainTile[18] = new TerrainTile(18, 11, TerrainTile.Terrain.SHEEP);
    }

    public void createDefaultBoard() throws Exception {
        this.createDefaultMapFromBaseFile();
        this.createDefaultTerrainTiles();
    }

    public void createRandomBoard() {
        /* TO DO */
    }

    public void displayAsciiBoard() {

        for (int i=0; i<43; i++) {
            for (int j=0; j<67; j++){
                System.out.print(boardMap[j][i]);
            }
        }

        System.out.println("");
    }

    public void displayColorAsciiBoard() {
        System.out.println("\033[31;1mHello\033[0m, \033[32;1;2mworld!\033[0m");
        System.out.println("\033[31mRed,\033[32m Green,\033[33m Yellow,\033[34m Blue\033[0m");
    }

    public void testBoard() throws Exception {
        System.out.println("TESTING BOARD");
        this.createDefaultMapFromBaseFile();
        this.createDefaultTerrainTiles();
        this.displayAsciiBoard();
    }

}
