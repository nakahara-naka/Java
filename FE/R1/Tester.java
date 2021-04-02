public class Tester {
  public static void main(String[] args) throws InterruptedException{
    createUserMobileDevice("Taro", "phone");
    createUserMobileDevice("Taro", "tablet");
    createUserMobileDevice("Hanako", "phone");
    createUserMobileDevice("Hanako", "tablet");
    Notifier notifier = Notifier.getInstance();
    notifier.send("Taro", "You have a message.");
    Thread.sleep(1000L);
    //notifier.shutdown();
    notifier.send("Taro", "You have 2 messages.");
    Thread.sleep(1000L);
    notifier.send("Hanako", "You have a message.");
    Thread.sleep(1000L);
    notifier.shutdown();
  }

//利用者名とその携帯端末名を登録、通知メッセージを受信
  private static void createUserMobileDevice(String user, String name){
    MobileDevice device = new MobileDevice(name, messageList -> 
      System.out.println(name + ": " + messageList));
    Notifier notifier = Notifier.getInstance();
    notifier.register(user, device);
    new Thread(() -> {
      notifier.loopForMessages(device);
      System.out.printf("Terminating %s' s %s%n", user, name);
    }).start();
  }
}

    

