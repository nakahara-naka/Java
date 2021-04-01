public class Tester {
  public static void main(String[] args) throws InterruptedException{
    createUserMobileDevice("Taro", "phone");
    createUserMobileDevice("Taro", "tablet");
    Notifier notifier = Notifier.getInstance();
    notifier.send("Taro", "You have a message.");
    Thread.sleep(500L);
    notifier.shutdown();
    notifier.send("Taro", "You have 2 messages.");
    Thread.sleep(500L);
  }

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

    

