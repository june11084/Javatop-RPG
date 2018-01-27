package models;

public class Dungeon2 extends Dungeon {
  public Dungeon2() {
    super();
  }
  @Override
  public void explore(Hero hero) {
    System.out.println("Your food has been stolen by a dragon that resides on the 5th floor of a volcano dungeon");
    System.out.println("In order to save it, you must travel through 5 floors with monsters that becomes stronger each floor");
    System.out.println("You head into the underground dungeon");

    pause();

    System.out.println("The first floor feels very damp and slimy ");

    pause();

    System.out.println("You feel something wet drip onto your face, you look up and sees a slime monster!");
    //declaring monsters
    Monster slime = new Monster("The slime", 1, 2);
    Monster crazyAnt = new Monster("Crazy Ant", 3, 3);
    Monster poisonWasps = new Monster("Poison Wasps", 3, 3);
    Monster goblin = new Monster("goblins", 6, 3);
    Monster minotaur = new Monster("minotaur", 10, 3);
    Monster dragon = new Monster("Last boss:Fire Dragon", 20, 5);

    System.out.println("\n" + hero.toString() + "\t" + slime.toString());
    pause();

    // The hero and the slime fight to the death
    while (hero.getHitpoints() > 0 && slime.getHitpoints() > 0) {
      hero.strike(slime);
      pause();

      if (hero.getHitpoints() > 0 && slime.getHitpoints() > 0) {
        slime.strike(hero);
      }

      System.out.println("\n" + hero.toString() + "\t" + slime.toString());
      pause();
    }

    // If the hero is still alive, the adventure continues
    if (hero.getHitpoints() > 0) {
      System.out.println("The slime is very weak, it died from one direct hit");
      System.out.println("You look around and find ");
      System.out.println("a pile of gold.  Do you pick it up? (y or n)");
      if (checkYes()) {
        System.out.println("You pocket 50 gold coins");
        System.out.println("The gold made you happy, you gain 2 hit points");
        hero.incGold(50);
        hero.increaseHitPoints(2);
      } else {
        System.out.println("You avoid the gold and got nothing");

      }

      System.out.println("You continue down the dungeon towards second floor. You see a treasure trove in the middle of nowhere.");
      System.out.println("Do you want to open it? (y or n)");

      if (checkYes()) //if user inputs y
      {
        int result = rand.nextInt(3);
        if (result == 0) {
          System.out.println("Yay!! It's a better sword!");
          System.out.println("You throw away your old partner like a piece of gum wrapper and gain one strength point!");
          hero.increaseStrength(1);
        } else if (result == 1) {
          System.out.println("oooh, a meat bun!");
          System.out.println("You gain 4 hitpoint");
          hero.increaseHitPoints(4);
        } else {
          System.out.println("There is nothing");
          System.out.println("You feel trolled and loses your temper, gains two strength point!!!");
          hero.increaseStrength(2);
        }

      } else //if user inputs anything else
      {
        System.out.println("Mother said don't touch anything suspecious, you are a good kid");
      }
      System.out.println("You take a break and gain 5 hitpoints");
      hero.increaseHitPoints(5);
      System.out.println("You want to check your stats so you took your apple and pocket watch, UGH! APPLE WATCH!");
      System.out.println("\n" + hero.toString() + " Gold: " + hero.getGold() + "\t");
      pause();
      System.out.println();
      System.out.println("You have reached the 2nd floor and there are two tunnels");
      System.out.println("Do you wish to go right or left? (r or l)");
      if (checkRight())// if user inputs r or R
      {
        System.out.println("uh oh, a gaint crazy ant has appeared!");
        // The hero and the crazyAnt fight to the death
        while (hero.getHitpoints() > 0 && crazyAnt.getHitpoints() > 0) {
          hero.strike(crazyAnt);
          pause();

          if (hero.getHitpoints() > 0 && crazyAnt.getHitpoints() > 0) {
            crazyAnt.strike(hero);
          }

          System.out.println("\n" + hero.toString() + "\t" + crazyAnt.toString());
          pause();
        }
        if (hero.getHitpoints() > 0) {
          System.out.println("The opponent lies dead at your feet.");
          System.out.println("You look around and find ");
          System.out.println("a pile of gold.  Do you pick it up? (y or n)");
          if (checkYes()) {
            System.out.println("You pocket 100 gold coins");
            hero.incGold(100);
          } else {
            System.out.println("You avoid the gold, but gain 2 hit points");
            hero.increaseHitPoints(2);
          }

          System.out.println("You continue down the tunnel.  You see a another treasure chest.");
          System.out.println("Do you open it? (y or n)");
          if (checkYes()) {
            int result = rand.nextInt(2);
            if (result == 0) {
              System.out.println("You gain a small 2 hitpoint potion and drinks it.");
              hero.increaseHitPoints(2);
            }
            if (result == 1) {
              System.out.println("You gain a medium 4 hitpoint potion and drinks it.");
              hero.increaseHitPoints(4);
            }
            if (result == 2) {
              System.out.println("You gain a big 6 hitpoint potion and drinks it.");
              hero.increaseHitPoints(6);
              System.out.println("\n" + hero.toString() + "\t");
            }
          } else {
            System.out.println("You could've gotten a something good.");
          }

        }
      } else {
        System.out.println("Are you sure that you want to chose left? choose again (r or l)");
        if (checkLeft()) // if user inputs l or L
        {
          System.out.println("phew! you noticed some sneaky poison wasps that has snuck up on you.");
          // The hero and the wombat fight to the death
          while (hero.getHitpoints() > 0 && poisonWasps.getHitpoints() > 0) {
            hero.strike(poisonWasps);
            pause();

            if (hero.getHitpoints() > 0 && poisonWasps.getHitpoints() > 0) {
              poisonWasps.strike(hero);
            }

            System.out.println("\n" + hero.toString() + "\t" + poisonWasps.toString());
            pause();
          }
          if (hero.getHitpoints() > 0) {
            System.out.println("The opponent lies dead at your feet.");
            System.out.println("You look around and find ");
            System.out.println("a pile of gold.  Do you pick it up? (y or n)");
            if (checkYes()) {
              System.out.println("You pocket 100 gold coins");
              hero.incGold(100);
            } else {
              System.out.println("You avoid the gold, but gain 2 hit points");
              hero.increaseHitPoints(2);
            }

            System.out.println("You continue down the tunnel.  You see a another treasure chest.");
            System.out.println("Do you open it? (y or n)");
            if (checkYes()) {
              int result = rand.nextInt(2);
              if (result == 0) {
                System.out.println("You gain a small hitpoint potion and drinks it.");
                hero.increaseHitPoints(2);
              }
              if (result == 1) {
                System.out.println("You gain a medium hitpoint potion and drinks it.");
                hero.increaseHitPoints(4);
              }
              if (result == 2) {
                System.out.println("You gain a big hitpoint potion and drinks it.");
                hero.increaseHitPoints(6);
                System.out.println("\n" + hero.toString() + "\t");
              }
            } else {
              System.out.println("You could've gotten a something good.");
            }
          }
        }
      }
      System.out.println("You take rejuvenating bath at the underground crystal lake, recover 5 hitpoints");

      hero.increaseHitPoints(5);

      System.out.println("You proceed to the 3rd floor.");

      System.out.println("You see a wandering goblin and decides to get some info out of him ");

      pause();

      // The hero and the goblin fight to the end
      while (hero.getHitpoints() > 0 && goblin.getHitpoints() > 0) {
        hero.strike(goblin);
        pause();

        if (hero.getHitpoints() > 0 && goblin.getHitpoints() > 0) {
          goblin.strike(hero);
        }

        System.out.println("\n" + hero.toString() + "\t" + goblin.toString());

        pause();

      }
      System.out.println("The you have defeated the goblin, do you wish to interrogate him to make him talk?(y or n)");
      if (checkYes()) {
        System.out.println("The goblin doesn't talk and dies, you move on.");

        pause();

        System.out.println("The 4th floor is very hot and you get a little dizzy, loses 3 strength points.");
        hero.increaseStrength(-3);

        pause();

        System.out.println("Suddenly, you hear a loud roar and a monstrous minotaur appears ");

        pause();

        System.out.println("It's a cake...");

        System.out.println("You dash at the cake at full speed");

        pause();

        // The hero and the minotaur fight to the death
        while (hero.getHitpoints() > 0 && minotaur.getHitpoints() > 0) {
          hero.strike(minotaur);
          pause();

          if (hero.getHitpoints() > 0 && minotaur.getHitpoints() > 0) {
            minotaur.strike(hero);
          }

          System.out.println("\n" + hero.toString() + "\t" + minotaur.toString());
          pause();
        }

        System.out.println("You have defeated the cake, it was a piece of cake");

        System.out.println("\n" + hero.toString() + "\t");

        pause();

        System.out.println("You have finally reached 5th floor");

        System.out.println("A three headed dragon appears!");

        System.out.println("You start to fight the dragon intensely");

        // The hero and the dragon fight to the death
        while (hero.getHitpoints() > 0 && dragon.getHitpoints() > 0) {
          hero.strike(dragon);
          pause();

          if (hero.getHitpoints() > 0 && dragon.getHitpoints() > 0) {
            dragon.strike(hero);
          }

          System.out.println("\n" + hero.toString() + "\t" + dragon.toString());
          pause();

        }
        if (hero.getHitpoints() > 0) {
          System.out.println("You have defeated the dragon and recovered your food!");
        }

      } else {
        System.out.println("You spare the goblin, to thank you for your kindness," +
                "\n the goblin tells you a secret path that leads to where your food is and outside of the dungeon");
        System.out.println("You successfully recovers your food and escapes");
      }
    }
  }
}
