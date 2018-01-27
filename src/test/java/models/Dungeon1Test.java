package models;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Dungeon1Test {

  @Test
  public void checkIfYes() {
    String answer="";
    String input = "yes";
    ByteArrayInputStream  in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Dungeon dungeon = new Dungeon1();
    if(dungeon.checkYes()){
      answer = "yes";
    }
    assertEquals("yes", answer);
  }

  @Test
  public void checkRight() {
    String answer="";
    String input = "r";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Dungeon dungeon = new Dungeon2();
    if(dungeon.checkRight()){
      answer = "right";
    }
    assertEquals("right", answer);
  }

  @Test
  public void checkLeft() {
    String answer="";
    String input = "L";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
    Dungeon dungeon = new Dungeon2();
    if(dungeon.checkLeft()){
      answer = "left";
    }
    assertEquals("left", answer);
  }
}