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
    Tile boardTile[] = new Tile[19];
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

    private void createDefaultTiles() {
        boardTile[0] = new Tile(0, 10, Tile.Terrain.ORE);
        boardTile[1] = new Tile(1, 2, Tile.Terrain.SHEEP);
        boardTile[2] = new Tile(2, 9, Tile.Terrain.WOOD);
        boardTile[3] = new Tile(3, 12, Tile.Terrain.GRAIN);
        boardTile[4] = new Tile(4, 6, Tile.Terrain.BRICK);
        boardTile[5] = new Tile(5, 4, Tile.Terrain.SHEEP);
        boardTile[6] = new Tile(6, 10, Tile.Terrain.BRICK);
        boardTile[7] = new Tile(7, 9, Tile.Terrain.GRAIN);
        boardTile[8] = new Tile(8, 11, Tile.Terrain.WOOD);
        boardTile[9] = new Tile(9, 0, Tile.Terrain.DESERT, true);
        boardTile[10] = new Tile(10, 3, Tile.Terrain.WOOD);
        boardTile[11] = new Tile(11, 8, Tile.Terrain.ORE);
        boardTile[12] = new Tile(12, 8, Tile.Terrain.WOOD);
        boardTile[13] = new Tile(13, 3, Tile.Terrain.ORE);
        boardTile[14] = new Tile(14, 4, Tile.Terrain.GRAIN);
        boardTile[15] = new Tile(15, 5, Tile.Terrain.SHEEP);
        boardTile[16] = new Tile(16, 5, Tile.Terrain.BRICK);
        boardTile[17] = new Tile(17, 6, Tile.Terrain.GRAIN);
        boardTile[18] = new Tile(18, 11, Tile.Terrain.SHEEP);
    }

    public void createDefaultBoard() throws Exception {
        this.createDefaultMapFromBaseFile();
        this.createDefaultTiles();
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
        this.createDefaultTiles();
        this.displayAsciiBoard();
    }

}
