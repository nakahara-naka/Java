//着せ替えインターフェース
public interface Skinnable {
  int BLACK = 0;  //黒
  int RED = 1;    //赤
  int GREEN = 2;  //緑
  int BLUE = 3;   //青
  int LEOPARD = 4; //ヒョウ柄
  void changeSkin(int skin); //スキン変更
}
