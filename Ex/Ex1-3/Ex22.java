import java.util.Scanner;

public class Ex22{
  public static void main(String[] args){

    System.out.println("Exercise22 キーボードから数値を入力します");

    System.out.println("キーボードから入力してください");
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    
    System.out.println("入力された文字は「" + n + "」です");

  }

}

