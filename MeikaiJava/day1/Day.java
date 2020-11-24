//日付クラス（第一版）
class Day{
  private int year;
  private int month;
  private int date;

//--- コンストラクタ ---//
  Day(int year, int month, int date){
    this.year = year;
    this.month = month;
    this.date = date;
  }

//--- 年、月、日を取得 (アクセッサ：ゲッタ）---//
  int getYear()  { return year; }
  int getMonth() { return month; }
  int getDate()  { return date; }

//--- 年、月、日を設定 ---（アクセッサ：セッタ）//
  void setYear(int year)  { this.year = year; }
  void setMonth(int month){ this.month = month; }
  void setDate(int date)  { this.date = date; }

  void set(int year, int month, int date){
    this.year = year;
    this.month = month;
    this.date = date;
  }

//--- 曜日を求める（日曜日～土曜日を0～6で返却） ---//
  int dayOfWeek(){
    int y = year;
    int m = month;
    if (m == 1 || m == 2){
      y--;
      m += 12;
    }
    return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
  }
}
