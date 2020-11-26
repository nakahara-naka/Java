//2次元座標クラスと3次元座標クラス

//2次元座標クラス
class Point2D{
  int x;
  int y;

  //コンストラクタ
  Point2D(int x, int y){
    this.x = x;
    this.y = y;
  }

  void setX(int x){ this.x = x; }
  void setY(int y){ this.y = y; }

  int getX(){ return x; }
  int getY(){ return y; }
}

//3次元座標クラス
class Point3D extends Point2D{
  int z; //z座標

  Point3D(int x, int y, int z){
    super (x, y);
    this.z = z;
  }

  void setZ(int z){ this.z = z; }
  int getZ(){ return z; }
}

public class PointTester{
  public static void main(String[] args){
    Point2D a = new Point2D(10, 14);
    Point3D b = new Point3D(10, 20, 30);

    System.out.printf("a = (%d, %d)\n", a.getX(), a.getY());
    System.out.printf("b = (%d, %d, %d)\n", b.getX(), b.getY(), b.getZ());
  }
}
