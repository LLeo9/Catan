import java.util.Random;

public class Dice {

    public Dice() {
    }

    //Create two die
    int die1 = 0;
    int die2 = 0;
    int diceSum = 0;

    //Create new random number generator
    Random randGen = new Random();

    //Get new random numbers for dice; values 1-6
    public void rollDice() {
        die1 = randGen.nextInt(5) + 1;
        die2 = randGen.nextInt(5) + 1;
    }

    public int getDiceSum() {
        return (die1 + die2);
    }

    //Print the values of the dice and sum
    public void displayDiceAll() {
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Sum: " + this.getDiceSum());
    }

    public void testDice() {
        System.out.println("TESTING DICE");
        this.rollDice();
        this.displayDiceAll();
        System.out.println("");
    }
}
