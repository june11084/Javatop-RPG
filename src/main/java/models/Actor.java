package models;

import java.util.Random;

public abstract class Actor {
  protected int hitPoints;
  protected int strength;
  protected String name;
  private Random die;

  public Actor(String name, int hitPoints, int strength) {
    this.name = name;
    this.hitPoints = hitPoints; // the health of the Actor
    this.strength = strength;   // this Actor throws a strength-sided die

    die = new Random();
  }
}
