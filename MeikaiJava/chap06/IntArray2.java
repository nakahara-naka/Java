//配列の各要素に１，２，３，４，５を代入して表示
class IntArray2{
  public static void main(String[] args){
    int[] a = new int[5];
    for (int i = 0; i < a.length; i++)
      a[i] = i + 1;

    for (int i = 0; i < a.length; i++)
      System.out.println("a[" + i + "] = " + a[i]);

//逆順にする
    for (int i = 0; i < a.length; i++)
      a[i] = 5 - i;

    for (int i = 0; i < a.length; i++)
      System.out.println("a[" + i + "] = " + a[i]);
  }
}
