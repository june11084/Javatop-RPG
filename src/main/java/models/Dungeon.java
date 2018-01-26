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
    System.out.print("\t(hit enter)"); //kind of like smashing continue button
    scan.nextLine();
  }

  protected boolean checkYes() {
    String ans = scan.nextLine();
    return (ans.toString().equals("Yes") || ans.toString().equals("yes")||ans.toString().equals("y")||ans.toString().equals("Y"));
  }

  public abstract void explore(Hero hero); //empty method to be customized in child classes
}


