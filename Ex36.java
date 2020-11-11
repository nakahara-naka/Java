import java.util.Scanner;

public class Ex36{
  public static void main(String[] args){

    System.out.println("Exercise35 キーボードから整数値を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    //System.out.println("入力されたxは「" + x + "」です");

//余りを求める
    int n = x%2;

    if(n == 0 && x >= 0){
      System.out.println(x + "は正の偶数です。");
    } else if(n == 0 && x < 0){
      System.out.println(x + "は負の偶数です。");
    } else if(n == 1 && x > 0){
      System.out.println(x + "は正の奇数です。");
    } else if(n != 0 && x < 0){
      System.out.println(x + "は負の奇数です。");
    }

  }

}

