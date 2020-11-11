import java.util.Scanner;

public class Ex35{
  public static void main(String[] args){

    System.out.println("Exercise35 キーボードからxの数値を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    //System.out.println("入力されたxは「" + x + "」です");

//余りを求める
    int n = x%2;

    if(n == 0){
      System.out.println(x + "は偶数です。");
    } else if(n == 1){
      System.out.println(x + "は奇数です。");
    }

  }

}

