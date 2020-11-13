//switch文とbreak文の働きの理解を深めるためのプログラム
import java.util.Scanner;

class SwitchBreak{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数："); 
    int hand = stdIn.nextInt();

    switch(hand){
      case 0 : System.out.println("A"); 
               System.out.println("B"); 
               break;

      case 2 : System.out.println("C"); 

      case 5 : System.out.println("D"); 
               break;
      case 6 :
      case 7 : System.out.println("E");
               break;

      default: System.out.println("F");
      break;
    }

  }
}
