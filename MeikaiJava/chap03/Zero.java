//読み込んだ値は正の値か、そうでないか？
import java.util.Scanner;

class Zero{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値："); int n = stdIn.nextInt();

    if (!(n !=  0))
      System.out.println("その値は0です。");
    else System.out.println("その値は0ではありません。");

  }
}
