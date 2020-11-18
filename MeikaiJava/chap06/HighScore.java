//点数を読み込んで合計点、平均点を表示（配列版）
import java.util.Scanner;

class HighScore{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int sum = 0; //合計
    final int NUMBER = 5; //人数
    int[] tensu = new int[NUMBER]; //点数を要素数＝人数の配列で初期化

    System.out.println(NUMBER + "人の点数を入力せよ。");
    for (int i = 0; i < NUMBER; i++){
      System.out.print((i + 1) + "番の点数：");
      tensu[i] = stdIn.nextInt();
    }

    int max = tensu[0];
    for(int i = 1; i < NUMBER; i++)
      if(max < tensu[i]) max = tensu[i];

    int min = tensu[0];
    for(int i = 1; i < NUMBER; i++)
      if(min > tensu[i]) min = tensu[i];

    System.out.println("最高点は" + max + "点です。");
    System.out.println("最低点は" + min + "点です。");

  }
}
