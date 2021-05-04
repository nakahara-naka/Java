public class Main{
  public static void main(String[] args){
    Sample s = new Sample(10);
    Sample ss = new Sample("test");

    modify2(s.num);
    modify2(ss.str);

    System.out.println(s.num);
    System.out.println(ss.str);

    System.out.println(modify(s.num));
    System.out.println(modify(ss.str));
  }

  private static int modify(int num){
    num *= 2;
    return num;
  }

  private static String modify(String str){
    str +=  "にプラスしました。";
    return str;
  }

  private static void modify2(int num){
    num *= 2;
  }

  private static void modify2(String str){
    str +=  "にプラスしました。";
  }
}


