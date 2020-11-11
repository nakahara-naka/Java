import java.util.Scanner;

public class Ex32{
  public static void main(String[] args){

    System.out.println("Exercise32 キーボードからx、yの数値を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    System.out.println("入力されたxは「" + x + "」です");
    int y = scan.nextInt();
    System.out.println("入力されたyは「" + y + "」です");

    if(x > y){
      System.out.println(x + "が大きい。");
    } else if(x < y){
      System.out.println(y + "が大きい。");
    }

  }

}

