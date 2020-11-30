package NumberingGame;

import java.util.Scanner;
import java.util.Random;

public class Input1{

  public int Computer(){
    Random rand = new Random();
    int r = rand.nextInt(101);
    return r;
  }

  public int user(){
    Scanner stdIn = new Scanner(System.in);
    System.out.print("数字を入力してください：");
    int n = stdIn.nextInt();
    return n;
  }
}

