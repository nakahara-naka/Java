public class MyTest{
  public static void main(String[] args){
    MySample ms = MySample.getInstance();
    MySample ms2 = MySample.getInstance();

    System.out.println("ms = " + ms);
    System.out.println("ms2 = " + ms2);
   
  }
}

