import java.util.Scanner;

public class Ex38{
  public static void main(String[] args){


    Scanner scan = new Scanner(System.in);

    System.out.println("Exercise38 中間試験の点数を入力してください。");
    int x = scan.nextInt();
    System.out.println("中間試験:" + x + "点");

    System.out.println("Exercise38 期末試験の点数を入力してください。");
    int y = scan.nextInt();
    System.out.println("期末試験:" + y + "点");

    int z = x + y;

    if(x >= 60 && y >= 60){
      System.out.println("合格");
    }else if(z >= 130){
      System.out.println("合格");
    }else if(z >= 100 && (x >= 90 || y >= 90)){
      System.out.println("合格");
    } else {
      System.out.println("不合格");
    }

  }

}

