//配列の代入練習

import java.util.Arrays;

class AssignArray{
  public static void main(String[] args){
    int[] a = {1,2,3,4,5};
    int[] b = {6,5,4,3,2,1,0};

    System.out.println("a = " + Arrays.toString(a));
    System.out.println("b = " + Arrays.toString(b));

    //b = a; //配列bをaにコピー？ 間違い
    if (a.length != b.length)
      b = new int[a.length];
      for (int i = 0; i < a.length; i++)
        b[i] = a[i];

    a[0] = 10;
    System.out.println("配列aをbにコピーしてa[0]に10を入れました。");
    System.out.println("a = " + Arrays.toString(a));
    System.out.println("b = " + Arrays.toString(b));
  }
}
