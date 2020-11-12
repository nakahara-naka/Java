//読み込んだ値は正の値か、そうでないか？
import java.util.Scanner;

class Equal{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a："); int a = stdIn.nextInt();
    System.out.print("整数b："); int b = stdIn.nextInt();

    if (a == b)
      System.out.println("２つの値は等しいです。");
    else System.out.println("２つの値は等しくありません。");

  }
}
