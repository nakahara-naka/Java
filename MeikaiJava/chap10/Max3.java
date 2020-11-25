//３つの整数値の最大値を求める
import java.util.Scanner;
class Max3{

  //--- a,b,cの最大値を返却 ---//
  static int max(int a, int b, int c){
    int max = a;
    if (a < b) max = b;
    if (b < c) max = c;
    return max;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数a："); int a = stdIn.nextInt();
    System.out.print("整数b："); int b = stdIn.nextInt();
    System.out.print("整数c："); int c = stdIn.nextInt();

    System.out.println("最大値は" + max(a, b, c) + "です。");
  }

}
