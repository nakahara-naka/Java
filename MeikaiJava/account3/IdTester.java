//識別番号クラス（その１）
class Id{
  static int counter = 0; 
  private int id;        //識別番号
  
  //--- コンストラクタ ---//
  public Id(){
    id = ++counter; //識別番号
  }

  //--- 識別番号を取得 ---//
  public int getId(){
    return id;
  }
}

public class IdTester{
  public static void main(String[] args){
    Id a = new Id();
    Id b = new Id();

    System.out.println("aの識別番号：" + a.getId());
    System.out.println("bの識別番号：" + b.getId());

    System.out.println("Id.counter = " + Id.counter);
    System.out.println("a.counter = " + a.counter);
    System.out.println("b.counter = " + b.counter);
  }
}
