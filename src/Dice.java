import java.util.Random;

public class Dice {

    // Properties
    private int sides;

    // Constructor
    public Dice(int sides) {
        this.sides = sides;
    }

    // Methods
    public int roll() {
        Random random = new Random();
        return random.nextInt(this.sides) + 1;
    }

    // Getters and Setters
    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
