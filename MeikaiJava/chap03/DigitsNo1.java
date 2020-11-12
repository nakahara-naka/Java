//読み込んだ整数値の桁数
import java.util.Scanner;

class DigitsNo1{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値："); int n = stdIn.nextInt();

    if (n == 0)
      System.out.println("その値は0です。");
    else if (n >= -9 && n <= 9) 
      System.out.println("一桁です");
    else
      System.out.println("二桁以上です");
  }
}
