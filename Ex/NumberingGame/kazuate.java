package NumberingGame;

public class kazuate{
  public static void main(String[] args){
    System.out.println("数当てゲームをしましょう");
    System.out.println("5回以内に当ててください");
    Input1 ip1 = new Input1();
    Judge1 j1 = new Judge1();

    for (int i = 0; i < 5; i++){
      int c = ip1.Computer();
      int u = ip1.user();
    
      String s = j1.Judgement(c, u);
      if (s.equals("当たりです！！")){
        System.out.println(s);
        break;
      } else {
        System.out.println(s);
        if (i == 4)
          System.out.println("残念でした。ゲームオーバーです");
      }
    }
  }
}
