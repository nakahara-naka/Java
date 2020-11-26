//is-Aの関係とインスタンスへの参照（組み合わせの検証）
class TimeAccountTester2{
  public static void main(String[] arg){
    Account adachi = new Account("足立幸一", "123456", 1000);
    TimeAccount nakata = new TimeAccount("仲田真二", "654321", 200, 500);

    Account x;  //クラス型変数は。。。
    x = adachi;
    x = nakata;

    System.out.println("xの預金残高：" + x.getBalance());

    TimeAccount y;
    y = nakata; //自分自身の型のインスタンスを参照できる

    System.out.println("yの預金残高：" + y.getBalance());
    System.out.println("yの定期預金残高：" + y.getTimeBalance());
  }
}
