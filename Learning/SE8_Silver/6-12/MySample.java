public class MySample{
  private static MySample instance = null;
  private MySample (){}
  public static MySample getInstance(){
    if (instance == null){
      instance = new MySample();
      System.out.println("instance == null");
    }
    return instance;
  }
}
