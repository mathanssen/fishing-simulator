import java.util.ArrayList;
import java.util.Scanner;

public class Game {

  // Properties
  private ArrayList<CatchableItem> items;
  private Player player;
  private Dice dice;

  // Constructor
  public Game() {
    this.items = generateItems();
  }

  // Methods
  public ArrayList<CatchableItem> generateItems() {
    ArrayList<CatchableItem> list = new ArrayList<CatchableItem>();
    list.add(new Fish("Baby Shark", 1));
    list.add(new Fish("Trout", 2));
    list.add(new Fish("Fire Carp", 3));
    list.add(new Fish("Red Snapper", 4));
    list.add(new Fish("Tuna", 5));
    list.add(new Fish("Super Rare Lucky Fish", 6));
    list.add(new JunkItem("A wet newspaper", "Paper"));
    list.add(new JunkItem("Broken Glasses", "Glass"));
    list.add(new JunkItem("A plastic bottle", "Plastic"));
    list.add(new JunkItem("Seaweed", "Plants"));
    return list;
  }

  public void play() {
    System.out.println("What is your name ?");
    Scanner scanner = new Scanner(System.in);
    this.player = new Player(scanner.next());
    System.out.print(player.getName() + ", do you want to fish (y/n) ? ");
    this.dice = new Dice(10);
    String response = scanner.next();
    while (response.equals("y")) {
      int number = this.dice.roll();
      CatchableItem caughtItem = this.items.get(number - 1);
      if (caughtItem instanceof Fish) {
        Fish fish = (Fish) caughtItem;
        System.out.println("You caught a fish!");
        System.out.println("Type: " + fish.getDescription());
        System.out.println("Points: " + fish.getPoints());
        this.player.setPoints(this.player.getPoints() + fish.getPoints());
        this.player.setFishCaught(this.player.getFishCaught() + 1);
      } else if (caughtItem instanceof JunkItem) {
        JunkItem junkItem = (JunkItem) caughtItem;
        System.out.println("You caught a junk item!");
        System.out.println("Type: " + junkItem.getDescription());
        this.player.setPoints(0);
      }
      System.out.print(player.getName() + ", do you want to fish (y/n) ? ");
      response = scanner.next();
    }
    gameOver();
  }

  public void gameOver() {
    System.out.println(this.player.getName() + " stats:");
    System.out.println("Total fish caught: " + this.player.getFishCaught());
    System.out.println("Total points: " + this.player.getPoints());
  }
}
