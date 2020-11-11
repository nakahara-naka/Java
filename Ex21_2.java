import java.util.Scanner;

public class Ex21_2{
  public static void main(String[] args){

    System.out.println("Exercise21-2 キーボードから文字列入力します");

    System.out.println("キーボードから入力してください");
    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    
    System.out.println("入力された文字は「" + str + "」です");

  }

}

