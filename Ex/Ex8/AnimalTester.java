class AnimalTester{
  public static void main(String[] args){
    Animal[] a = new Animal[4];
    for (int i = 0; i < a.length; i++){
      if (i % 2 == 0){
        a[i] = new Cat();
      } else if (1 % 2 == 1){
        a[i] = new Dog();
      }
      a[i].Speak();
    }
  }
}
