//instance演算子の利用例
class PetInstanceOf{
  public static void main(String[] args){
    Pet[] a = {
      new Pet("Kurt", "アイ"),
      new RobotPet("R2D2", "ルーク"),
      new Pet("マイケル", "英雄"),
    };

    for (int i = 0; i < a.length; i++){
      System.out.println("a[" + i + "] ");
      if (a[i] instanceof RobotPet)
        ((RobotPet)a[i]).work(0);
      else
        a[i].introduce();
    }
  }
}


