//定期預金付き銀行口座クラス（第1版）
class TimeAccount extends Account{
  private long timeBalance; //預金残高（定期預金）

  //コンストラクタ
  TimeAccount(String name, String no, long balance, long timeBalance){
    super(name, no, balance); //クラスAccountのコンストラクタ呼び出し
    this.timeBalance = timeBalance; //預金残高（定期預金）
  }

  //定期預金残高を調べる
  long getTimeBalance(){
    return timeBalance;
  }

  //定期預金を解約して普通預金に戻す
  void cancel(){
    deposit(timeBalance);
    timeBalance = 0;
  }
}



