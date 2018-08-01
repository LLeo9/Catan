public class Hexagon {

    static int hexFullWidth = 11;
    static int hexFullHeight = 5;
    static int hexHalfWidth = 6; //TO DO: convert to halfFullWidth / 2 rounded up
    static int hexHalfHeight = 3; //TO DO: convert to halfFullHeight / 2 rounded up

    Coordinates hexCenter = new Coordinates();
    Coordinates hexN = new Coordinates();
    Coordinates hexNE = new Coordinates();
    Coordinates hexSE = new Coordinates();
    Coordinates hexS = new Coordinates();
    Coordinates hexSW = new Coordinates();
    Coordinates hexNW = new Coordinates();

    public Hexagon() { }

    public Hexagon(Coordinates center) {
        hexCenter = center;
        this.moveHexBorder();
    }

    public void setHexCenter(Coordinates c) {
        hexCenter = c;
        this.moveHexBorder();
    }

    private void moveHexBorder() {
        hexN.setXY(hexCenter.getX(), (hexCenter.getY() + hexHalfHeight));
        hexS.setXY(hexCenter.getX(), (hexCenter.getY() - hexHalfHeight));
        hexNE.setXY((hexCenter.getX() + 1),(hexN.getY() - 1));
        hexSE.setXY((hexCenter.getX() + 1),(hexS.getY() + 1));
        hexSW.setXY((hexCenter.getX() - 1),(hexS.getY() + 1));
        hexNW.setXY((hexCenter.getX() - 1),(hexN.getY() - 1));
    }

    public void displayHexagon() {
        System.out.println("Hexagon Center: " + hexCenter.getCoordinates());
        System.out.println("N: " + hexN.getCoordinates() + ", NE: " + hexNE.getCoordinates() + ", SE: " + hexSE.getCoordinates());
        System.out.println("S: " + hexS.getCoordinates() + ", SW: " + hexSW.getCoordinates() + ", NW: " + hexNW.getCoordinates());
    }

    public void testHexagon() {
        System.out.println("TESTING HEXAGON");
        this.displayHexagon();
        this.setHexCenter(new Coordinates(1, 1));
        this.displayHexagon();

    }

}
