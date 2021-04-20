public class M2{
  public static void main(String[] args){
    int[] a = new int[5];
    int total = 0;
    int j = 3;

    for (int i = 0 ; i < a.length ; i++){
      a[i] = i + j;
      total += a[i];
    }

    System.out.println(total);
  }
}

