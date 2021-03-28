public class Player {

    // Properties
    private String name;
    private int points;
    private int fishCaught;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.points = 0;
        this.fishCaught = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getFishCaught() {
        return fishCaught;
    }

    public void setFishCaught(int fishCaught) {
        this.fishCaught = fishCaught;
    }
}
