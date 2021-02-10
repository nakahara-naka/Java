//図形クラス群（第一版）の利用例

class ShapeTester{
  public static void main(String[] args){
    Shape[] a = new Shape[2];
    a[0] = new Point();
    a[1] = new Rectangle(4, 3);

    for (Shape s : a){
      s.draw(); //描画
      System.out.println();
    }

    Shape b = new Point();

    System.out.println("----");
    b.draw();
  }
}
