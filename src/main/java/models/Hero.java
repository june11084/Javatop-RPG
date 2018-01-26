package models;

public class Hero extends Actor {
  private int gold;
  public Hero(String name, int hitPoints, int strength) {
    super(name, hitPoints, strength);
    gold = 0;
  }
  public void increaseStrength(int increase) {
    strength += increase;
  }

  public void increaseHitPoints(int increase) {
    hitPoints += increase;
  }

  public int getGold() {
    return gold;
  }

  public void incGold(int increment) {
    gold += increment;
  }
}
