package hitandblow;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Input{

  public int[] Computer(){
    Random rand = new Random();
    int[] r = new int[4]; //返す配列

    //とりあえず一回全部に乱数を入れる
    for (int i = 0; i < r.length; i++){
      r[i] = rand.nextInt(8) + 1;  
    }

    //重複がないか検査してもしあったら再度乱数を振る
    for (int i = 0; i < r.length; i++){
      //int dup = r[i];

      for (int j = 0; j < r.length; j++){
        //if(i != j && dup == r[j] ){
        if(i != j && r[i] == r[j] ){
          System.out.println("ダブり" + r[j]); //チェック用
          while(true){
            r[j] = rand.nextInt(8) + 1;
            int count = 0; //重複チェック用カウンタ
            for(int k = 0; k < r.length; k++){
              if (j != k && r[j] == r[k]) {
                count += 1;
              }
            } 
            if(count == 0)  break;
          }
        }
      }
    }

    return r;

  }

  public int[] user(){
    Scanner stdIn = new Scanner(System.in);
    int[] n = new int[4]; //ユーザが選ぶ配列
    int reselect = 1; //配列を選び直すフラグ

    while(reselect == 1){
      for (int i = 0; i < n.length; i++){
        do{
          System.out.print("数字を入力してください("+ (i + 1) + "桁目)：");
          n[i] = stdIn.nextInt();
        } while(n[i] < 1 || n[i] > 8);
      }

      System.out.println("あなたの選んだ数字：");
      System.out.println(Arrays.toString(n));
      do{
        System.out.print("よろしいですか？／Yes(0)、No(1)：");
        reselect = stdIn.nextInt();
      } while (reselect != 0 && reselect != 1 );
      
    }
    //System.out.println("test");
    return n;
  }
}

