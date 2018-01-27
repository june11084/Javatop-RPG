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
}