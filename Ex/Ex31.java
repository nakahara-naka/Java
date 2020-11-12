import java.util.Scanner;

public class Ex31{
  public static void main(String[] args){

    System.out.println("Exercise31 キーボードからx、yの数値を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    System.out.println("入力されたxは「" + x + "」です");
    int y = scan.nextInt();
    System.out.println("入力されたyは「" + y + "」です");

    if(x > y){
      System.out.println("xはyより大きい。");
    }

  }

}

