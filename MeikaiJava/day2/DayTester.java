//日付クラスDay（第二版）利用例
 import java.util.Scanner;

 class DayTester{
   public static void main(String[] args){
     Scanner stdIn = new Scanner(System.in);

     System.out.println("day1を入力せよ。");
     System.out.print("年：　"); int y = stdIn.nextInt();
     System.out.print("月：　"); int m = stdIn.nextInt();
     System.out.print("日：　"); int d = stdIn.nextInt();

     Day day1 = new Day(y, m, d);
     System.out.println("day1 = " + day1);

     Day day2 = new Day(day1);  //day1と同じ日付（参照先）
     System.out.println("day2をday1と同じ日付として作りました。");
     System.out.println("day2 = " + day2);

     if (day1.equalTo(day2))
       System.out.println("day1とday2は等しいです。");
     else
       System.out.println("day1とday2は等しくありません。");

     Day d1 = new Day(); //1年1月1日
     Day d2 = new Day(2027); //2027年1月1日
     Day d3 = new Day(2027, 10); //2027年10月1日
     Day d4 = new Day(2027, 10, 15); //2027年10月15日

     System.out.println("d1 = " + d1);
     System.out.println("d2 = " + d2);
     System.out.println("d3 = " + d3);
     System.out.println("d4 = " + d4);

     Day[] a = new Day[3]; //要素数３のDay型配列

   }
 }
