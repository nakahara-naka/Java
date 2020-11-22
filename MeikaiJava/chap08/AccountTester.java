//銀行口座クラス（第一版）とそれをテストするクラス


//銀行口座クラスをテストするクラス
class AccountTester{
  public static void main(String[] args){
    Account adachi = new Account();   //足立君の口座
    Account nakata = new Account();   //仲田君の口座

    adachi.name    = "足立幸一";
    adachi.no      = "123456";
    adachi.balance = 1000;

    nakata.name    = "仲田真二";
    nakata.no      = "654321";
    nakata.balance = 200;

    adachi.balance -= 200;
    nakata.balance += 100;

    System.out.println("■足立君の口座");
    System.out.println("  口座名義：" + adachi.name);
    System.out.println("  口座番号：" + adachi.no);
    System.out.println("  預金残高：" + adachi.balance);

    System.out.println("■足立君の口座");
    System.out.println("  口座名義：" + nakata.name);
    System.out.println("  口座番号：" + nakata.no);
    System.out.println("  預金残高：" + nakata.balance);

  }
}

//銀行口座クラス（第一版）
class Account{
  String name; //口座名義
  String no;   //口座番号
  long balance;//預金残高
}
