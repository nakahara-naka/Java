//２つの整数値を読み込んで加減乗除した値を表示
import java.util.Scanner;

class ArithInt{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("xとyを加減乗除します。"); //xの値を表示

    System.out.print("xの値："); //xの値を表示
    int x =stdIn.nextInt();
    System.out.print("yの値："); //xの値を表示
    int y =stdIn.nextInt();
    
    System.out.println("xの値は" + x + "です。"); //xの値を表示
    System.out.println("yの値は" + y + "です。"); //yの値を表示
    
    System.out.println("x + y = " + (x + y)); //yの値を表示
    System.out.println("x - y = " + (x - y)); //yの値を表示
    System.out.println("x * y = " + (x * y)); //yの値を表示
    System.out.println("x / y = " + (x / y)); //yの値を表示
    System.out.println("x % y = " + (x % y)); //yの値を表示
    System.out.println("平均は" + (x + y)/2 + "です。"); //yの値を表示

  }
}
