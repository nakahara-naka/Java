//点数を読み込んで合計点、平均点を表示（配列版）
import java.util.Scanner;

class PointSumAveArray{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int sum = 0; //合計
    final int NUMBER = 5; //人数
    int[] tensu = new int[NUMBER]; //点数を要素数＝人数の配列で初期化

    System.out.println(NUMBER + "人の点数を入力せよ。");
    for (int i = 0; i < NUMBER; i++){
      System.out.print((i + 1) + "番の点数：");
      tensu[i] = stdIn.nextInt();
      sum += tensu[i];
    }
    System.out.println("合計は" + sum + "点です。");
    System.out.println("平均は" + (double)sum / NUMBER + "点です。");

  }
}
