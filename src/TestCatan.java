import java.util.Map;

public class TestCatan {

    public static void main(String[] args) throws Exception {

        //DICE TESTING
/*        Dice dice = new Dice();
        dice.testDice();
*/
        //TerrainTile TESTING
/*        TerrainTile t1 = new TerrainTile();
        t1.testTerrainTile(18, 3, TerrainTile.Terrain.DESERT);
        t1.setVertices(1,2,3,4,5,6,7,8,9,10,11,12);
        t1.printVertices();
*/
        //BOARD TESTING
/*        Board board = new Board();
        board.testBoard();
*/
        //PLAYER TESTING
/*        Player player1 = new Player();
        player1.testPlayer();
*/
        //GAMEPLAY TESTING
/*        GamePlay game = new GamePlay();
        game.testGame();
*/

        //MAPCOORDINATES TESTING
/*        Coordinates coord1 = new Coordinates();
        coord1.setX(4);
        coord1.setY(5);
        Coordinates coord2 = new Coordinates(2,9);
        coord1.printCoordinates();
        coord2.printCoordinates();
*/
        //PIECES TESTING
/*        Pieces pieces = new Pieces();
        pieces.testPieces();
*/
        //TILE TESTING
/*        TerrainTile tile = new TerrainTile();
        tile.testTile();
*/
        //HEXAGON TESTING
        Hexagon hex = new Hexagon(new Coordinates(0, 0));
        hex.testHexagon();



    }
}
