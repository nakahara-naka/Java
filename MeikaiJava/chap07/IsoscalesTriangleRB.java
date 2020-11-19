//左下側が直角の直角二等辺三角形を表示
import java.util.Scanner;

class IsoscalesTriangleRB{
  //---   文字cをn個連続表示 ---//
  static void putChars(char c, int n){
    while(n-- > 0)
      System.out.print(c);
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.println("右下側が直角の直角二等辺三角形を表示します。");
    System.out.print("段数は："); int n = stdIn.nextInt();

    for (int i = 0; i <= n; i++){
      putChars(' ', n - i); //' 'をn-i個表示
      putChars('+', i);     //'+'をn個表示
      System.out.println();
    }
  }
}
