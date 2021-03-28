public class Fish extends CatchableItem {

    // Properties
    private int points;

    // Constructor
    public Fish(String description, int points) {
        super(description);
        this.points = points;
    }

    // Getters and Setters
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
