//円周の長さと円の面積を求める（その１：円周率を浮動小数点リテラルで表す）
import java.util.Scanner;

class Circle2{
  public static void main(String[] args){
    final double PI = 3.1416;
    Scanner stdIn = new Scanner(System.in);

    System.out.print("半径：");
    double r = stdIn.nextDouble(); //半径

    System.out.println("円周の長さは" + 2 * PI * r + "です");
    System.out.println("面積は" +  PI * r * r + "です");
  }
}

