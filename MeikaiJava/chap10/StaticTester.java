//クラス／インスタンス　フィールドと
//クラス／インスタンス　メソッド

class Static{
  private static int s;
  private int a;

  public static void m1(){ }
  public        void f1(){ }

  //---クラスメソッド ---//
  public static void m2(int x){
    s = x; //OK
    //a = x; //エラー
    m1();  //OK
    //f1()  //エラー
  }

  //--- インスタンスメソッド ---//
  public void f2(int x){
    s = x; //OK
    a = x; //OK
    m1();  //OK
    f1();  //OK
    System.out.printf("s = %d   " + "a = %d\n", s, a);
  }
}

public class StaticTester{
  public static void main(String[] args){
    Static c1 = new Static();
    Static c2 = new Static();

    Static.m2(5); //クラスメソッド
    c1.f2(10); //インスタンスメソッド
    c2.f2(20);
  }
}


