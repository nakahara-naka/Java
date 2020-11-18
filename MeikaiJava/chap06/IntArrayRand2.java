//配列の全要素に値を読み込んで表示
import java.util.Random;
import java.util.Scanner;

class IntArrayRand2{
  public static void main(String[] args){
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    System.out.print("要素数：");
    int n = stdIn.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n ; i++)  //全要素に値を入れる
      a[i] = rand.nextInt(10) + 1;

    for (int i = 10; i >= 1 ; i--){ //グラフの上から表示させるため
      for (int j = 0; j < n; j++)
        if (a[j] >= i)
          System.out.print("* ");
        else 
          System.out.print("  ");
      System.out.println();
    }

    for (int i = 0; i < 2 * n ; i++)
      System.out.print('-');
    System.out.println();

    for (int i = 0; i < n; i++)
     // System.out.print(i  + " ");
      System.out.print(i % 10 + " "); //桁をずらさないため１の桁だけ表示
    System.out.println();
  }
}
