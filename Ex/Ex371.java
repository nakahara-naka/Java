import java.util.Scanner;

public class Ex371{
  public static void main(String[] args){

    System.out.println("Exercise371 キーボードから試験の点数を入力します");

    Scanner scan = new Scanner(System.in);

    int x = scan.nextInt();
    //System.out.println("入力されたxは「" + x + "」です");


    if(x >= 60){
      System.out.println("合格");
    } else if (x < 60) {
      System.out.println("不合格");
    }

  }

}

