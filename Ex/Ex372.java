import java.util.Scanner;

public class Ex372{
  public static void main(String[] args){

    System.out.println("Exercise372 キーボードから試験の点数を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    //System.out.println("入力されたxは「" + x + "」です");


    if(x >= 80 && x <= 100){
      System.out.println("大変よくできました");
    }else if(x >= 60 && x < 80){
      System.out.println("よくできました");
    } else if (x < 60) {
      System.out.println("ざんねんでした。");
    }

  }

}

