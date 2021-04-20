public class Main{
  public static void main(String[] args){
    int[] a = new int[5];
    int total = 0;

    for (int i = 0, j = 3; i < a.length && j < a.length + 3; i++, j++){
    //for (int i = 0, j = 3; i < a.length && j < 8; i++, j++){
      System.out.println("i = " + i + "; j = " + j);
      a[i] = i + j;
      total += a[i];
      System.out.println("a[" + i + "] = " + a[i]);
      System.out.println("total = " + total);
    }

    System.out.println(total);
  }
}

