//２値の最大値と３値の最大値を求めるメソッド（多重定義）
import java.util.Scanner;
class Max{
  //--- a, bの最大値を返却 ---//
  static int max(int a, int b){
    return a > b ? a : b;
  }

  //--- a, b, cの最大値を返却 ---//
  static int max(int a, int b, int c){
    int max = a;
    if (a < b) max = b;
    if (b < c) max = c;
    return max;
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("xの値："); int x = stdIn.nextInt();
    System.out.print("yの値："); int y = stdIn.nextInt();
    System.out.print("zの値："); int z = stdIn.nextInt();

    //２値の最大値
    System.out.println("xとyの最大値は" + max(x, y) + "です。");

    //３値の最大値
    System.out.println("xとyとzの最大値は" + max(x, y, z) + "です。");

  }
}
