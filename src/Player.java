public class Player {

    public Player () {
    }

    //Values at Game Start
    int playerID = 0;
    int victoryPts = 0;
    int nCities = 4;
    int nSettlements = 5;
    int nRoadPieces = 15;

    public void setPlayerID(int id) {
        playerID = id;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getVictoryPts() {
        return victoryPts;
    }

    public int getnCities() {
        return nCities;
    }

    public int getnSettlements() {
        return nSettlements;
    }

    public int getnRoadPieces() {
        return nRoadPieces;
    }

    public void chgVictoryPts(int changeBy) {
        victoryPts += changeBy;
    }

    public void testPlayer() {
        System.out.println("TESTING PLAYER");
    }
}
