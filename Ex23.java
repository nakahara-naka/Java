import java.util.Scanner;

public class Ex23{
  public static void main(String[] args){

    System.out.println("Exercise23 キーボードから数値を入力します");

    System.out.println("キーボードから入力してください");
    Scanner scan = new Scanner(System.in);

//底
    int x = scan.nextInt();
    System.out.println("入力された文字は「" + x + "」です");
    
//指数と答え
    int result = 0;
    for(int n = 1; n <= 3; n++){
      result = (int) Math.pow(x, n);
      System.out.println("入力した数の" + n + "乗＝" + result);
    }



  }

}

