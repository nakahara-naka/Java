//インターフェース（静的メソッド/デフォルトメソッド/非公開メソッド）
interface A {
  //静的メソッド
  static void hello() {
    System.out.println("Hello");
  }

  //非公開メソッド
  private void print(String s1, String s2) {
    System.out.println(s1 + " : " + s2);
  }

  //デフォルトメソッド
  default void On() {
    print("default", "On!");
  }

  //通常のメソッド
  void Off();
}

class A1 implements A {
  @Override public void Off() {
    System.out.println("A1 : Off!");
  }
}

class A2 implements A {
  @Override public void On() {
    System.out.println("A2 : On!");
  }
  @Override public void Off() {
    System.out.println("A2 : Off!");
  }
}

public class InterfaceTester {
  public static void main(String[] args){
    A.hello();

    A1 a1 = new A1();
    a1.On();
    a1.Off();

    A2 a2 = new A2();
    a2.On();
    a2.Off();
  }
}


