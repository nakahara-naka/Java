package hitandblow;
import java.util.Arrays;

public class HitandBlow{
  public static void main(String[] args){
    //Inputテスト
    int[] computer = new int[4];
    int[] user = new int[4];
    int gold = 0;
    int silver = 0;

    System.out.println("◇◇◇ Hit and Blow ゲームを始めます！ ◇◇◇");
    System.out.println("コンピュータが選んだ、１～８までの重複しない４つの数字と並びを当ててください。");
    System.out.println();
    Input ip = new Input();
    Judgement jd = new Judgement();

    computer = ip.Computer();

    for (int i = 10; i > 0; i--){

      user = ip.user();

      gold = jd.Gold(computer, user);
      silver = jd.Silver(computer, user);

      //テスト用出力
      System.out.println("配列のテスト");
      System.out.println(Arrays.toString(computer));
      System.out.println(Arrays.toString(user));

      System.out.println("ゴールド：" + gold);
      System.out.println("シルバー：" + silver);


      if (gold == 4){
        System.out.println("当たりです！！！");
        break;
      }
    }

  }
}
