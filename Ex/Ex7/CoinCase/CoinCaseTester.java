import java.util.Scanner;

class CoinCaseTester{

  public static void main(String[] args){

    Scanner stdIn = new Scanner(System.in);
    CoinCase c = new CoinCase();

    //硬貨を追加する
    for (int i = 0; i < 10; i++){
      System.out.print("何円硬貨？：");
      int y = stdIn.nextInt(); 
      System.out.print("枚数は？：");
      int n = stdIn.nextInt();

      c.AddCoins(y, n);
    }

    System.out.println("各硬貨が何枚でいくらあるか？");
    /*
    System.out.println("  500円：" + c.GetCount(500) + "枚、" + c.GetAmount(500) + "円");
    System.out.println("  100円：" + c.GetCount(100) + "枚、" + c.GetAmount(100) + "円");
    System.out.println("   50円：" + c.GetCount(50) + "枚、" + c.GetAmount(50) + "円");
    System.out.println("   10円：" + c.GetCount(10) + "枚、" + c.GetAmount(10) + "円");
    System.out.println("    5円：" + c.GetCount(5) + "枚、" + c.GetAmount(5) + "円");
    System.out.println("    1円：" + c.GetCount(1) + "枚、" + c.GetAmount(1) + "円");
    */
    System.out.printf("  500円%3d枚、%7d円\n", c.GetCount(500), c.GetAmount(500));
    System.out.printf("  100円%3d枚、%7d円\n", c.GetCount(100), c.GetAmount(100));
    System.out.printf("   50円%3d枚、%7d円\n", c.GetCount( 50), c.GetAmount( 50));
    System.out.printf("   10円%3d枚、%7d円\n", c.GetCount( 10), c.GetAmount( 10));
    System.out.printf("    5円%3d枚、%7d円\n", c.GetCount(  5), c.GetAmount(  5));
    System.out.printf("    1円%3d枚、%7d円\n", c.GetCount(  1), c.GetAmount(  1));
    System.out.printf("総枚数 %3d枚\n", c.GetCount());
    System.out.printf("総額：        %7d円\n", c.GetAmount());
  }
}
