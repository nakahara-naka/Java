import java.util.Scanner;

class LinerSearch{
  //--- 配列aの要素からkeyと一致する最も先頭の要素を線形探索 ---//
  static int linerSearch(int[] a, int key){
    for (int i = 0; i < a.length; i++)
      if (a[i] == key)
        return i; //探索成功（インデックスを返却）
    return -1;    //探索失敗（-1を返却）
  }

  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

    System.out.print("要素数："); 
    int num = stdIn.nextInt();
    int[] x = new int[num];

    for (int i = 0; i < num; i++){
      System.out.print("x[" + i + "]：");
      x[i] = stdIn.nextInt();
    }
    System.out.print("探す値：");
    int ky = stdIn.nextInt();

    int idx = linerSearch(x, ky); //配列ｘから値がkyの要素を探索

    if (idx == -1)
      System.out.println("その値の要素は存在しません。");
    else
      System.out.println("その値はx[" + idx + "]にあります。");

  }
}
