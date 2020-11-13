//読み込んだ整数値の桁数
import java.util.Scanner;

class MinMax{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a: "); int a = stdIn.nextInt();
    System.out.print("整数b: "); int b = stdIn.nextInt();

    int min, max;

    if(a < b){
      min = a;
      max = b;
    } else {
      min = b;
      max = a;
    }

    System.out.println("大きいのは" + max + "です。");
    System.out.println("小さいのは" + min + "です。");
    
  }
}
