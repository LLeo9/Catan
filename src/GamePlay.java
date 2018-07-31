import javax.sound.midi.SysexMessage;

public class GamePlay {

    public GamePlay() {

    }

    int nPlayers = 0;
    Dice dice = new Dice();
    Board board = new Board();
    Resources resources = new Resources();
    Player bank = new Player(); //HOW TO USE THIS???

    //Setup board
    public void setupBoard() throws Exception {

        //Create players
        nPlayers = 2; //WILL BE INPUT INSTEAD OF HARDCODED

        Player[] players = new Player[3];
        for (int p = 0; p < nPlayers; p++) {
            players[p] = new Player();
        }

        for (int p = 0; p < nPlayers; p++) {
            players[p].setPlayerID(p+1);
        }

        board.createDefaultBoard();
        board.displayAsciiBoard();
        resources.setupDefaultBankResources();

        //Each player places 2 settlements, 2 pairs of roads, gets resourcces from first(?) settlement

        //Round 1: players 1 to n place first settlement and road
        for (int p = 0; p < nPlayers; p++) {
            //Player places settlement
            //Player places one road piece
        }

        //Round 2: players n to 1 place second settlement and road, and get resources from 2nd settlement
        for (int p = nPlayers; p > 0; p--) {
            //Player places settlement
            //Player gets resouces from that settlement
            //Player places one road piece
        }
    }

    //Turn part 1: roll for resources
    public void RollForResources() {
        dice.rollDice();
        System.out.println("Rolled: " + dice.getDiceSum());

        if (dice.getDiceSum() == 7)
            System.out.println("ROBBER!");


    }

    public void testGame() throws Exception {
        this.setupBoard();
        this.RollForResources();
    }
}
