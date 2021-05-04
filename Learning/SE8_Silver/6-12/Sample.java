//import java.util.Scanner;

public class Sample{
  private String name = "ゆみこ";
  private int age = 50; 
  private String email = "y.dust.and.bones@gmail.com";

  public Sample(){
    this("n", 12, "e");
  }

  private Sample(String n, int a, String e){
    super();
  }

  String getName(){
    return name;
  }
  
  int getAge(){
    return age;
  }

  String getEmail(){
    return email;
  }

}

