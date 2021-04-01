//クラス MobileDevice
public final class MobileDevice {
  private final String name;
  private final NotificationListener listener;

  //コンストラクタ
  public MobileDevice(String name, NotificationListener listener) {
    this.name = name;
    this.listener = listener;
  }

  public NotificationListener getListener() { return listener; }

  public String getName() { return name; }
}


