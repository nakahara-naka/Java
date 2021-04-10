public class Main{
  public static void main(String[] args){
    //String[][] array = {{ "A", "B"}, {"R", "T"}, {"C", "D", "E"}, {"N", "M", "K", "J"}};
    //String[][] array = {{ "A", "B"}, {"R", "T"}, {"C", "D", "E", "F"}};
    String[][] array = {{ "A", "B"}, {"R", "T", "G", "U"}, {"C", "D"}};
    int total = 0;

    for (String[] tmp : array){
      total = tmp.length;
      System.out.println(tmp);
      for (String a : tmp){
        System.out.println(a);
      }
    }
    System.out.println(total);

    System.out.println("array length = " + array.length );
    


  }
}
