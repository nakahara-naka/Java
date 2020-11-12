public class Ex17{
  public static void main(String[] args){
    int x = 3;
    int y = 7;
    System.out.println("Exercise1-7 x = " + x + " y = " + y);
    
    int tmp = x;
    x = y;
    y = tmp;

    System.out.println("Exercise1-7 x = " + x + " y = " + y);
  }

}
