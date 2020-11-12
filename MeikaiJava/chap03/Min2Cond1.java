//読み込んだ整数値の桁数
import java.util.Scanner;

class Min2Cond1{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a: "); int a = stdIn.nextInt();
    System.out.print("整数b: "); int b = stdIn.nextInt();

    int min = a < b ? a:b; //小さいほうの値;
    System.out.println("小さいのは" + min + "です。");
    System.out.println("小さいのは" + (a < b ? a:b ) + "です。(min省略）");
    System.out.println("それらの差は" + (a < b ? b-a:a-b ) + "です。(min省略）");
  }
}
