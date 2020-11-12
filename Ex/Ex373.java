import java.util.Scanner;

public class Ex373{
  public static void main(String[] args){

    System.out.println("Exercise373 キーボードから試験の点数を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    //System.out.println("入力されたxは「" + x + "」です");


    if(x >= 80 && x <= 100){
      System.out.println("優");
    }else if(x >= 70 && x < 80){
      System.out.println("良");
    }else if(x >= 60 && x < 70){
      System.out.println("可");
    } else if (x < 60) {
      System.out.println("不可");
    }

  }

}

