import java.util.Scanner;

class ScanString{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("s:" );
    String s = stdIn.next();

    for (int i = 0; i < s.length(); i++)
      System.out.println("s[" + i + "] = " + s.charAt(i));

    int[] a = new int[s.length()];
    int sum = 0;
    for (int i = 0; i < s.length(); i++){
      a[i] = Character.getNumericValue(s.charAt(i));
      //a[i] = Integer.parseInt(s.charAt(i));
      System.out.println("a[" + i + "] = " + a[i]);
      sum += a[i];
    }

    System.out.println("sum = " + sum);
  }
}
