package hitandblow;
import java.util.Arrays;

public class HitandBlow{
  public static void main(String[] args){
    int[] computer = new int[4];
    int[] user = new int[4];
    int gold = 0;
    int silver = 0;

    System.out.println("◇◇◇ Hit and Blow ゲームを始めます！ ◇◇◇");
    System.out.println("コンピュータが選んだ、１～８までの重複しない４つの数字と場所を当ててください。");
    System.out.println("・数字と場所があっていれば、ゴールド");
    System.out.println("・数字はあるが場所があっていなければ、シルバー");
    System.out.println("10回以内に正解しないと、ゲームオーバーです。");
    System.out.println();
    Input ip = new Input();
    Judgement jd = new Judgement();

    computer = ip.Computer();

    for (int i = 1; i <= 10; i++){

      System.out.println("◇" + i + "回目：");

      user = ip.user();

      gold = jd.Gold(computer, user);
      silver = jd.Silver(computer, user);

      //テスト用出力
      /*
      System.out.println("配列のテスト");
      System.out.println(Arrays.toString(computer));
      System.out.println(Arrays.toString(user));
      */

      System.out.println("ゴールド：" + gold);
      System.out.println("シルバー：" + silver);


      if (gold == 4){
        System.out.println("コンピュータ：" + Arrays.toString(computer));
        System.out.println("当たりです！！！");
      //System.out.println(Arrays.toString(user));
        break;
      }

      if (i == 10){
        System.out.println("コンピュータ：" + Arrays.toString(computer));
        System.out.println("ゲームオーバーです．．．");
      }
    }
  }
}
