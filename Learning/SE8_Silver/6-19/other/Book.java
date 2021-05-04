package other;

public class Book{
  private String isbn;
  public void setIsbn(String isbn){
    this.isbn = isbn;
  }
  public void printInfo(){
  //protected void printInfo(){
    System.out.println(isbn);
  }
}
