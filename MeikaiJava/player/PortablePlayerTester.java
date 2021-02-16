//クラスPortablePlayerの利用例
class PortablePlayerTester{
  public static void main(String[] args){
    PortablePlayer a = new PortablePlayer();
    a.play();
    a.stop();
    a.changeSkin(Skinnable.BLUE);
    //a.changeSkin(Skinnable.LEOPARD);
  }
}
