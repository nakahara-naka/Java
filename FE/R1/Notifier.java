//クラスNotifier
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Notifier {

  //クラス変数（static)Notifier型のインスタンス INSTANCE
  //シングルトン
  private static final Notifier INSTANCE = new Notifier();

  private final Object lock = new Object();

  //利用者ごとに携帯端末を管理 userMobileDevices
  private final Map<String,  List<MobileDevice>> userMobileDevices
    = new HashMap<>();

  //携帯端末ごとに通知メッセージを保持 messagesToDeliver
  private final Map<MobileDevice, List<String>> messagesToDeliver
    = new HashMap<>();
    
  private volatile boolean active = true;

  //メソッド(ゲッタ）
  public static Notifier getInstance() { return INSTANCE; }

  //コンストラクタ
  private Notifier() {}

  //利用者名とその携帯端末名を登録
  public void register(String user, MobileDevice device) {
    synchronized (lock) {
      List<MobileDevice> devices = userMobileDevices.get(user);
      //利用者に紐づく携帯端末リストがない場合
      if (devices == null) {
        //携帯端末は複数
        devices = new ArrayList<>();
        //利用者名に紐づく携帯端末リストを登録
        userMobileDevices.put(user, devices);
      }
      //携帯端末リストに追加
      devices.add(device);
    }
  }

  //指定された利用者名で登録されている携帯端末にメッセージを配信
  //なんで携帯端末が引数でないのか？→ユーザ名から携帯端末リストを取得するから
  public void send(String user, String message) {
    List<MobileDevice> devices = new ArrayList<>();
    synchronized (lock) {
      if (userMobileDevices.containsKey(user)){
        //登録されているユーザの端末リスト毎にメッセージリストを取得
        for (MobileDevice device : userMobileDevices.get(user)){
          List<String> messageList = messagesToDeliver.get(device);
          //メッセージリストがない場合、リストを作成して登録
          if (messageList == null){
            messageList = new ArrayList<>();
            messagesToDeliver.put(device, messageList);
          }
          //メッセージリストに引数のメッセージを追加
          messageList.add(message);
          //デバイスリストにデバイスを追加？
          devices.add(device);

          System.out.println(user + ":" + device.getName() + ":" + message);
        }
      }
    }
    for (MobileDevice device : devices){
      synchronized (device){
        //このオブジェクトのモニターで待機中のすべてのスレッドを再開します。
        //通知メッセージがあることを待ち受け状態のスレッドに通知
        device.notifyAll();
      }
    }
  }

  //通知メッセージがあれば端末のリスナに通知、なければ待ち受けにする
  public void loopForMessages(MobileDevice device){
    while (active){
      List<String> messageList;
      synchronized (lock){
        //携帯端末に保持された通知メッセージを削除しそれをmessageListに返す
        messageList = messagesToDeliver.remove(device);
      }
      if (messageList != null){
        //メソッドが返すインターフェース型フィールドのメソッドを呼ぶ？
        device.getListener().onNotificationReceived(messageList);
      }
      synchronized (device){
        try{
          //通知メッセージが到着するかタイムアウトするまで待つ
          device.wait(3000L);
        } catch (InterruptedException e){
          break;
        }
      }
    }
  }

  //未配信の全メッセージ、全登録情報を削除、通知システムを停止
  public void shutdown(){
    active = false;
    List<MobileDevice> devices = new ArrayList<>();
    synchronized (lock){
      messagesToDeliver.clear();
      for (String user : userMobileDevices.keySet()){
        for (MobileDevice device : userMobileDevices.get(user)){
          devices.add(device);
        }
      }
      userMobileDevices.clear();
    }
    for (MobileDevice device : devices){
      synchronized (device){
        //待ち受け状態のスレッドに通知
        device.notifyAll();
      }
    }
  }
}
 



