package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ActorTest {

  @Test
  public void CharacterInfoToString() {
    Actor hero = new Actor("hero",5,5);
    assertEquals("hero hit points: 5 strength: 5",hero.toString());
  }

  @Test
  public void StrikeAndTakeHit() {
    Actor hero = new Actor("hero",5,5);
    Actor monster = new Actor("monster",5,5);
    hero.takeHit(5);
    monster.takeHit(1);
    assertEquals(0,hero.getHitpoints());
    assertEquals(4,monster.getHitpoints());
  }

  @Test
  public void throwDie() {
    Actor hero = new Actor("hero",5,1);
    hero.throwDie();
    assertEquals(1,hero.throwDie());
  }
}