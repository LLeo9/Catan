public class Pieces {

    //default values for default game
    static int maxSettlements = 5;
    static int maxCities = 4;
    static int maxRoads = 15;

    int settlements;
    int cities;
    int roads;

    public Pieces() {
        settlements = maxSettlements;
        cities = maxCities;
        roads = maxRoads;
    }

    public int getSettlements() {
        return settlements;
    }

    public int getCities() {
        return cities;
    }

    public int getRoads() {
        return roads;
    }

    public void placeSettlement() {
        settlements--;
    }

    public void placeCity() {
        cities--;
        settlements++;
    }

    public void placeRoad() {
        roads--;
    }

    public void printPieces() {
        System.out.println("Settlements: " + settlements);
        System.out.println("Cities: " + cities);
        System.out.println("Roads: " + roads);
    }

    public void testPieces() {
        System.out.println("TESTING PIECES");
        this.printPieces();
        this.placeSettlement();
        this.placeCity();
        this.placeRoad();
        this.printPieces();
    }
}
