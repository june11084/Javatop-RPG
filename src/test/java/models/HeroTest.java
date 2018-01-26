package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {
  @Test
  public void CharacterInfoToString() {
    Hero hero = new Hero("hero",5,5);
    assertEquals("hero hit points: 5 strength: 5",hero.toString());
  }

  @Test
  public void StrikeAndTakeHit() {
    Hero hero = new Hero("hero",5,5);
    Hero monster = new Hero("monster",5,5);
    hero.takeHit(5);
    monster.takeHit(1);
    assertEquals(0,hero.getHitpoints());
    assertEquals(4,monster.getHitpoints());
  }

  @Test
  public void throwDie() {
    Hero hero = new Hero("hero",5,1);
    hero.throwDie();
    assertEquals(1,hero.throwDie());
  }

  @Test
  public void increaseStrength() {
  }

  @Test
  public void increaseHitPoints() {
  }

  @Test
  public void getGold() {
  }

  @Test
  public void incGold() {
  }
}