package Janken;

public class Judge{
  public String Judgement(int c, int u){
    String s;
    if (c - u == 0)
      s = "あいこです";
    else if (c - u == 1 || c - u == -2)
      s = "あなたの勝ち！";
    else 
      s = "あなたの負け！";

    return s;
  }
}
