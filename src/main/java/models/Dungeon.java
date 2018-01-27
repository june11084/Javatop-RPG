package models;

import java.util.Random;
import java.util.Scanner;

public abstract class Dungeon { //declared abstract because there are no need to instantiate
  protected Scanner scan;
  protected Random rand;

  public Dungeon() {
    scan = new Scanner(System.in);
    rand = new Random();
  }

  protected void pause() {
    System.out.print("\t(hit enter)"); //this is to pause the while loops.
    scan.nextLine();
  }

  protected boolean checkYes() {
    String ans = scan.nextLine();
    return (ans.toString().equals("Yes") || ans.toString().equals("yes")||ans.toString().equals("y")||ans.toString().equals("Y"));
  }

  public abstract void explore(Hero hero); //empty method to have body filled in child classes(like interface)
}


