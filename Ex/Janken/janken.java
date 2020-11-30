package Janken;
import java.util.Scanner;

public class janken{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    String[] hand = {"グー", "チョキ", "パー"};
    Input ip = new Input();
    Judge j = new Judge();

    System.out.println("じゃんけんをしましょう");
    int n; //もう一度行うか？
    
    do {
      do {
        System.out.print("ゲームを終了(0)　ゲームを続ける(1)： ");
        n = stdIn.nextInt();
      } while (n != 0 && n != 1);
      if (n == 0) break;

      int c = ip.Computer();
      int u = ip.user();
      System.out.println("あなたの手：" + hand[u - 1]);
      System.out.println("コンピュータの手：" + hand[c - 1]);

      //判定
      String s = j.Judgement(c, u); 
      System.out.println(s);

      /*
      do{
        System.out.print("ゲームを終了(0)　ゲームを続ける(1)：");
        n = stdIn.nextInt();
      } while(n != 0 && n != 1);
      */

    } while(n == 1) ;
  }
}
