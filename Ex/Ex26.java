import java.util.Scanner;

public class Ex26{
  public static void main(String[] args){

    System.out.println("Exercise26 キーボードから数値を入力します");

    System.out.println("あなたの年齢は？");
    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    System.out.println("入力された年齢は「" + x + "」です");

    System.out.println("生まれてから現在まで、約" + x * 365 +  "日です");
    

  }

}

