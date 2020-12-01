package hitandblow;

public class Judgement{
  //場所と数字が一致
  public int Gold(int[] computer, int[] user){
    int r = 0;

    for (int i = 0; i < computer.length; i++){
      if (computer[i] == user[i]){
        r += 1;
      }
    }
    return r;
  }

  //数字だけ一致
  public int Silver(int[] computer, int[] user){
    int r = 0;
    for (int i = 0; i < computer.length; i++){
    }
    return r;
  }
}
