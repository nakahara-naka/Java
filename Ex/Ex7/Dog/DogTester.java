//Dogクラスを使ったプログラム
public class DogTester{
  public static void main(String[] args){
    Dog aki = new Dog("柴犬");
    aki.SetName("秋");
    aki.SetAge(3);
    aki.ShowProfile();

    Dog pochi = new Dog("雑種");
    pochi.SetName("ポチ");
    pochi.SetAge(5);
    pochi.ShowProfile();
  }
}
