public class Main{
  public static void main(String[] args){
    int[] arrayA =  {1, 2, 3, 4};
    int[] arrayB = arrayA.clone();
    System.out.println(arrayB[1]);

    System.out.println(arrayA == arrayB);

    for (int i : arrayB){
      System.out.println(i);
    }

  }
}

