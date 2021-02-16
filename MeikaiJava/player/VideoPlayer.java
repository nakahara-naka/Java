//----- ビデオプレイヤー ---//
public class VideoPlayer implements Player {
  private int id;  //製造番号
  private static int count = 0; //現在までに与えた製造番号

  public VideoPlayer() { //コンストラクタ
    id = ++count;
  }

  @Override public void play() {
    System.out.println("++ビデオ再生開始！");
  }

  @Override public void stop() {
    System.out.println("++ビデオ再生終了！");
  }

  public void printInfo() {
    System.out.println("++本機の製造番号は[" + id + "]です。");
  }
}




