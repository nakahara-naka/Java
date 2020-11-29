class Cat extends Animal
{
  public void Sleep(){
    System.out.println("スースー");
  }

  @Override public void Speak(){
    System.out.println("ニャー");
  }

}

class Dog extends Animal
{
  public void Run(){
    System.out.println("トコトコ");
  }

  @Override public void Speak(){
    System.out.println("ワンワン");
  }
}
