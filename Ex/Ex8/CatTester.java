class CatTester{
  public static void main(String[] args){
    Cat c = new Cat();
    c.Name = "ミー";
    c.Age = 3;
    c.ShowProfile();
    //c.Sleep();
    c.Speak();

    Dog d = new Dog();
    d.Name = "ポチ";
    d.Age = 5;
    d.ShowProfile();
    //d.Run();
    d.Speak();
  }
}

