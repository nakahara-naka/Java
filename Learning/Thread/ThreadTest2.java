public class ThreadTest2{
  public static void main(String[] args){
    SubThread sub = new SubThread();
    Thread thread = new Thread(sub);
    thread.start();

    /* メイン側で行う処理 */
    for (int i = 0; i < 10; i++){
      System.out.println("巨人がんばれ！！" + i);

      /* 少し待機する */
      try{
        Thread.sleep(300L);
      }catch(InterruptedException e){
      }
    }
  }
}

class SubThread implements Runnable{
  @Override
  public void run(){
    /* サブ側で行う処理 */
    for (int i = 0; i < 10; i++){
      System.out.println("阪神負けるな？！" + i);

      /* 少し待機する */
      try{
        Thread.sleep(500L);
      }catch(InterruptedException e){
      }
    }
  }
}
