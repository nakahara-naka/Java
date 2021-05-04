public class Tester {
  public static void main(String[] args) throws InterruptedException{
    createUserMobileDevice("Taro", "phone");
    createUserMobileDevice("Taro", "tablet");
    createUserMobileDevice("Hanako", "phone");
    createUserMobileDevice("Hanako", "tablet");
    createUserMobileDevice("Hiroshi", "tablet");
    Notifier notifier = Notifier.getInstance();
    notifier.send("Taro", "たろーへ");
    //Thread.sleep(1000L);
    //notifier.shutdown();
    notifier.send("Taro", "たろー、ごはんやで");
    //Thread.sleep(1000L);
    notifier.send("Hanako", "You have a message.");
    notifier.send("Taro", "はよおいで");
    notifier.send("Hiroshi", "You have a messages.");
    Thread.sleep(1000L);
    notifier.shutdown();
  }

//利用者名とその携帯端末名を登録、通知メッセージを受信
  private static void createUserMobileDevice(String user, String name){
    MobileDevice device = new MobileDevice(name, messageList -> 
      System.out.println(name + ": " + messageList));
    System.out.println("1 " + user + "'s " +  name  +  ">");
    Notifier notifier = Notifier.getInstance();
    notifier.register(user, device);
    new Thread(() -> {
      System.out.println("2 " + user + "'s " + name);
      notifier.loopForMessages(device);
      System.out.printf("Terminating %s' s %s%n", user, name);
    }).start();
  }
}

    

