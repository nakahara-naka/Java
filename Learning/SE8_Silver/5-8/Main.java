public class Main{
  public static void main(String[] args){
    for (int i = 0; i < 3; i++, period()){
      System.out.print(i);
    }

    System.out.println();
  }

  private static void period(){
    System.out.print(",");
  }
}
