public class JunkItem extends CatchableItem {

    // Properties
    private String material;

    // Constructor
    public JunkItem(String description, String material) {
        super(description);
        this.material = material;
    }

    // Getters and Setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

}
