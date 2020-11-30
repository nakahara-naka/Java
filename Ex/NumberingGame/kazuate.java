package NumberingGame;

public class kazuate{

  public static void main(String[] args){

    Input1 ip1 = new Input1();
    int c = ip1.Computer();
    Judge1 j1 = new Judge1();

    //正解検証用
    //System.out.println(c);

    System.out.println("数当てゲームをしましょう");
    System.out.println("5回以内に当ててください");
    System.out.println();

    for (int i = 0; i < 5; i++){
      int u = ip1.user();
      String s = j1.Judgement(c, u);
    
      if (s.equals("おめでとう！正解です！！")){
        System.out.println(s);
        break;
      } else {
        System.out.println(s);
        if (i == 4)
          System.out.println("ゲームオーバー");
      }
    }
  }
}
