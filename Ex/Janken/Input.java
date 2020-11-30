package Janken;

import java.util.Scanner;
import java.util.Random;

public class Input{

  public int Computer(){
    Random rand = new Random();
    int r = rand.nextInt(3) + 1;
    return r;
  }

  public int user(){
    Scanner stdIn = new Scanner(System.in);
    int n;

    do{
      System.out.print("数字を入力してください(1...グー、2...チョキ、3...パー)：");
      n = stdIn.nextInt();
    } while(n < 1 || n > 3);

    return n;
  }
}

