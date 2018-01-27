import models.Dungeon;
import models.Dungeon1;
import models.Dungeon2;
import models.Hero;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    final int heroHit = 6;
    final int heroStr = 8;
    Scanner scan = new Scanner(System.in);

    Hero hero = new Hero("You", heroHit, heroStr);

    System.out.println("You are walking through a forest and encounter");
    System.out.println("a dark tunnel in the side of a hill.");
    System.out.println("You see a sign by the side of the tunnel:");
    System.out.println("Welcome to the Caves of Fortune!\n");
    System.out.println("Do you wish to enter the Cave? (y or n)");
    String response = scan.next();

    if (response.charAt(0) == 'y' || response.charAt(0) == 'Y') {
      System.out.println("Great!  Adventure Awaits!");

      // Explore the first dungeon
      Dungeon dungeon = new Dungeon1();
      dungeon.explore(hero);

      // Explore the second dungeon, if alive
      if (hero.getHitpoints() > 0) {
        System.out.println("\n------------------------");
        System.out.println("You continue exploring the cave.\n");
        dungeon = new Dungeon2();
        dungeon.explore(hero);
      }else {
        System.out.println("You are dead.  No birds are singing.");
      }

      // Finish the game, if alive
      if (hero.getHitpoints() > 0) {
        System.out.println("\n------------------------");
        System.out.println("You walk towards a light at the end of the tunnel");
        System.out.println("and emerge from the Cave into a park ");
        System.out.println("filled with trees and singing birds.");
        System.out.println("You survived the adventure!! And escaped with " +
                hero.getGold() + " gold");
      } else {
        System.out.println("You are dead.  No birds are singing.");
      }
    } else {
      System.out.println("You walk away with no gold.");
    }
  }
}
