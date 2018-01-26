package models;

import java.util.Random;

public abstract class Actor {
  protected int hitPoints;
  protected int strength;
  protected String name;
  private Random die;

  public Actor(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints;
    this.strength = strength;

    die = new Random();
  }

  public String toString() {
    return name + " hit points: " + hitPoints + " strength: " + strength;
  }

  public void strike(Actor opponent) {
    System.out.println(name + " strikes at " + opponent.getName());

    int ourThrow = throwDie();
    int oppThrow = opponent.throwDie();

    if (ourThrow > oppThrow) {
      System.out.println("Good Hit!!");
      System.out.println(opponent.getName() + " loses a hit point");
      opponent.takeHit(1);
    } else {
      System.out.println(opponent.getName() + " ducks and is not hurt.");
    }

  }

  public String getName() {
    return name;
  }

  public void takeHit(int points) {
    hitPoints -= points;
  }

  public int getHitpoints() {
    return hitPoints;
  }

  protected int throwDie() {
    return die.nextInt(strength) + 1;
  }
}
