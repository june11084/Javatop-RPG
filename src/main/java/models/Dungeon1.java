package models;

public class Dungeon1 extends Dungeon{
  public Dungeon1() {super();} //inherent all properties from parent

  @Override
  public void explore(Hero hero) {
    System.out.println("You enter a dark tunnel.");
    System.out.println("You hear a sound.  What is it?");
    System.out.println("Oh No! Its a Wombat! And it does not look friendly.\n");

    // The hero encounters a monster with hitpoints 3 and strength 4
    Monster wombat = new Monster("The wombat", 3, 4);
    System.out.println("\n" + hero.toString() + "\t" + wombat.toString());
    pause();

    // The hero and the wombat fight to the death
    while (hero.getHitpoints() > 0 && wombat.getHitpoints() > 0) {
      hero.strike(wombat);
      pause();

      if (hero.getHitpoints() > 0 && wombat.getHitpoints() > 0) {
        wombat.strike(hero);
      }

      System.out.println("\n" + hero.toString() + "\t" + wombat.toString());
      pause();
    }

    // If the hero is still alive, the adventure continues
    if (hero.getHitpoints() > 0) {
      System.out.println("The wombat lies dead at your feet.");
      System.out.println("You look around and find ");
      System.out.println("a pile of gold.  Do you pick it up? (y n)");
      if (checkYes()) {
        System.out.println("You pocket 50 gold coins");
        hero.incGold(50);
      } else {
        System.out.println("You avoid the gold, but gain 2 hit points");
        hero.increaseHitPoints(2);
      }

      System.out.println("You continue down the tunnel.  You see a flask containing a purple potion.");
      System.out.println("Do you drink it? (y n)");

      if (checkYes()) {
        int result = rand.nextInt(3);
        if (result == 0) {
          System.out.println("Yay!! It's fermented grape juice.");
          System.out.println("You gain one strength point!");
          hero.increaseStrength(1);
        } else if (result == 1) {
          System.out.println("Ugh!! It tastes like dish water");
          System.out.println("You lose one strength point");
          hero.increaseStrength(-1);
        } else {
          System.out.println("It tastes like spring water");
          System.out.println("Nothing happens.");
        }

      } else {
        System.out.println("You might have missed a great opportunity.");
      }
    }
  }
}

