//---　円クラスと2次元座標クラスのテスト
public class CircleTester{
  public static void main(String[] args){
    Point2D[] p = new Point2D[] {
      new Point2D(3, 7), new Point2D(4, 6)
    };

    Circle c1 = new Circle();
    Circle c2 = new Circle(new Point2D(10, 15), 5);

    for (int i = 0; i < p.length; i++)
      System.out.println("p[" + i + "] =" + p[i].toString());

    c1.setRadius(10);
    System.out.println("c1 = " + c1.toString());
    System.out.println("c2 = " + c2.toString());
    
    //---ここからオリジナル
    //配列pの要素を中心にした円を作る
    Circle c3 = new Circle(p[0], 8);
    System.out.println("c3 = " + c3.toString());

    Circle c4 = new Circle(p[1], 0);
    System.out.println("c4 = " + c4.toString());

  }
}
