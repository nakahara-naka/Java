//配列の全要素に値を読み込んで表示
import java.util.Arrays;
import java.util.Scanner;

class IntArrayScan{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("要素数：");
    int n = stdIn.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n ; i++){
      System.out.print("a[" + i + "] = ");
      a[i] = stdIn.nextInt();
    }

    System.out.println("a = " + Arrays.toString(a));
  }
}
