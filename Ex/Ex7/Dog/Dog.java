//練習問題７－１
class Dog
{
  private String Name; 
  private int Age;
  private String DogBreed; //犬種

  //コンストラクタ
  public Dog(String DogBreed){
    this.DogBreed = DogBreed;
  }

  
  public void SetName(String nm)
  {
    Name = nm;
  }

  public void SetAge(int age)
  {
    Age = age;
  }

  public void ShowProfile()
  {
    System.out.println("■犬のプロフィールを表示します。");
    System.out.println("犬種は、" + DogBreed + "です。");
    System.out.println("名前は、" + Name + "です。");
    System.out.println("年齢は、" + Age + "歳です。");
  }


}
