import java.util.Scanner;

public class Ex24{
  public static void main(String[] args){

    System.out.println("Exercise24 キーボードから数値を入力します");

    System.out.println("キーボードから入力してください:x");
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    System.out.println("入力されたxは「" + x + "」です");

    int y = scan.nextInt();
    System.out.println("入力されたyは「" + y + "」です");
    
//答え
    int result = 0;
    result = x+y;
    System.out.println("x + y = " + result);
    
    result = x-y;
    System.out.println("x - y = " + result);
    
    result = x*y;
    System.out.println("x × y = " + result);

    result = x/y;
    System.out.println("x ÷ y = " + result);

    result = x%y;
    System.out.println("余り " + result);
    /*
    System.out.println("x + y = " + x + y);
    System.out.println("x - y = " + x - y);
    System.out.println("x × y = " + x * y);
    System.out.println("x ÷ y = " + x / y);
    System.out.println("余り" + x % y);
    */

  }

}

