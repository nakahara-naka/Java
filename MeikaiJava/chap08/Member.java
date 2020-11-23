//--- 会員クラス ---//
class Member{
  // フィールド（インスタンス変数）
  private String name;  //名前
  private int no;       //会員番号
  private int age;      //年齢

  //コンストラクタ
  Member(String name, int no, int age){
    this.name = name;
    this.no = no;
    this.age = age;
  }

  //インスタンスメソッド
  void print(){
    System.out.println("No." + no + "：" + name + "(" + age + "歳)");
  }
}
