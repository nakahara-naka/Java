//銀行口座クラス（第３版）

//銀行口座クラス（第３版）
public class Account{
  //クラス変数（静的フィールド）
  private static int counter = 0; //何番までの識別番号を与えたか

  private String name;   //口座名義
  private String no;     //講座番号
  private long balance;  //預金残高
  private int id;        //識別番号

  //--- コンストラクタ ---//
  public Account(String n, String num, long z){
    name = n;    //口座名義
    no = num;    //口座番号
    balance = z; //預金残高
    id = ++counter; //識別番号
  }

  //--- 識別番号を取得 ---//
  public int getId(){
    return id;
  }
  
  //--- 口座名義を調べる ---//
  String getName(){
    return name;
  }

  //--- 口座番号を調べる ---//
  String getNo(){
    return no;
  }

  //--- 預金残高を調べる ---//
  long getBalance(){
    return balance;
  }

  //--- k円預ける ---//
  void deposit(long k){
    balance += k;
  }

  //--- k円おろす ---//
  void withdraw(long k){
    balance -= k;
  }
}
/*
//銀行口座クラス（第二版）をテストするクラス
class AccountTester{
  public static void main(String[] args){
    //足立君の口座
    Account adachi = new Account("足立幸一", "123456", 1000);
    //仲田君の口座
    Account nakata = new Account("仲田真二", "654321", 200);

    adachi.withdraw(200);
    nakata.deposit(100);

    System.out.println("■足立君の口座");
    System.out.println("口座名義：" + adachi.getName());
    System.out.println("口座番号：" + adachi.getNo());
    System.out.println("預金残高：" + adachi.getBalance());

    System.out.println("■仲田君の口座");
    System.out.println("口座名義：" + nakata.getName());
    System.out.println("口座番号：" + nakata.getNo());
    System.out.println("預金残高：" + nakata.getBalance());
  }
}
*/

