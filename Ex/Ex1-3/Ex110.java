public class Ex110{
  public static void main(String[] args){

//底
    int x = 2;
    System.out.println("Exercise110 x = " + x);

//指数と答え
    int result = 0;
    for(int n = 1; n <= 3; n++){
      result = (int) Math.pow(x, n);
      System.out.println("xの" + n + "乗＝" + result);
    }

/*
    n = 2;
    result = (int) Math.pow(x, n);
    System.out.println("Exercise1-8 x = " + result);
    
    n = 3;
    result = (int) Math.pow(x, n);
    System.out.println("Exercise1-8 x = " + result);
    */
  }

}
