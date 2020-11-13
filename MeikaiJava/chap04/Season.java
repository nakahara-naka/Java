//入力された月の季節を表示
import java.util.Scanner;

class Season{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int retry; //もう一度？

    do{
      System.out.print("季節を求めます。\n何月ですか：");
      int month = stdIn.nextInt();

      if (month >= 3 && month <= 5)
        System.out.println("それは春です");
      else if (month >=6 && month <=8)
        System.out.println("それは夏です");
      else if (month >=9 && month <=11)
        System.out.println("それは秋です");
      else if (month == 12 || month == 1 || month == 2)
        System.out.println("それは冬です");

      System.out.println("もう一度？　1...yes／2...No：");
      retry = stdIn.nextInt();
    } while (retry == 1);
  }
}
