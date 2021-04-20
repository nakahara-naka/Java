import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    ArrayList<Integer> intList = new ArrayList<Integer>();

    intList.add(1);
    intList.add(3);
    intList.add(5);

    int total = 0;

    System.out.println(intList);

    for (int i : intList){
      total += i;
    }

    System.out.println("total = " + total);

  }
}
