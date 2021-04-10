public class Sample{
  private int num;
  private String name;
  public Sample(int num, String name){
    this.num = num;
    this.name = name;
  }

@Override
  public boolean equals(Object obj){
  //public boolean equals(Sample obj){
    if (obj == null ) return false;
    if (obj instanceof Sample){
      Sample s = (Sample) obj;
     // Sample s = obj;
      return s.num == this.num;
    }
    return false;
  }
}

