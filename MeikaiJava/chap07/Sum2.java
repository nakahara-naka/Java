//整数の総和を求める（可変個引数）
import java.util.Scanner;

class Sum2{
  //--- 2個以上の整数の総和を求める ---//
  static int sum(int... no){
    int s = 0;
    for (int i = 0; i< no.length; i++)
      s += no[i];
    return s;
  }

  public static void main(String...  args){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("sum(new int[]{1, 2})          = " + sum(new int[]{1, 2}));
    System.out.println("sum(new int[]{1, 2, 3})       = " + sum(new int[]{1, 2, 3}));
    System.out.println("sum(new int[]{1, 2, 3, 4, 5}) = " + sum(new int[]{1, 2, 3, 4}));

    System.out.print("配列xの要素数は：");
    int num = stdIn.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++){
      System.out.print("x[" + i + "] ：");
      x[i] = stdIn.nextInt();
    }
    System.out.println("sum(x) = " + sum(x));

  }
}
