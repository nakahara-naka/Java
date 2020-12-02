package hitandblow2;

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
          //System.out.println("ダブり" + r[j]); //チェック用
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

    System.out.print("４つの数字（例：1234）:");
    String s = stdIn.next();
    
    for (int i = 0; i < s.length(); i++){
      n[i] = Character.getNumericValue(s.charAt(i));
    }
    //System.out.println("test");
    return n;
  }
}

