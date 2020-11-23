//--- 会員クラスのテストプログラム ---//
class MemberTester{
  public static void main(String[] args){
    //クラス型変数、コンストラクタの呼び出し
    Member suzuki = new Member("鈴木", 1344, 25);

    suzuki.print();  // インスタンスメソッドの呼び出し

  }
}
