package NumberingGame;

public class Judge1{
  public String Judgement(int c, int u){
    String s = "";
    if (c == u)
      s = "当たりです！！";
    else if (c < u)
      s = "もっと小さいよ";
    else if (c > u)
      s = "もっと大きいよ";

    return s;
  }
}
