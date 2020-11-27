class CoinCase
{
  private int Yen500; //コインの種類
  private int Yen100; //コインの種類
  private int Yen50; //コインの種類
  private int Yen10; //コインの種類
  private int Yen5; //コインの種類
  private int Yen1; //コインの種類

  //コインを追加する
  public void AddCoins(int Yen, int Num){
    if (Yen == 500){
      this.Yen500 += Num;
    } else if(Yen == 100){
      this.Yen100 += Num;
    } else if(Yen == 50){
      this.Yen50 += Num;
    } else if(Yen == 10){
      this.Yen10 += Num;
    } else if(Yen == 5){
      this.Yen5 += Num;
    } else if(Yen == 1){
      this.Yen1 += Num;
    }
  }

  //コインが何枚あるか（種類指定あり）
  public int GetCount(int Yen){
    int n = 0;
    if (Yen == 500){
      n = this.Yen500;
    } else if(Yen == 100){
      n = this.Yen100;
    } else if(Yen == 50){
      n = this.Yen50;
    } else if(Yen == 10){
      n = this.Yen10;
    } else if(Yen == 5){
      n = this.Yen5;
    } else if(Yen == 1){
      n = this.Yen1;
    }
    return n;
  }

  //コインが何枚あるか（全部）
  public int GetCount(){
    return this.Yen500 + this.Yen100 + this.Yen50 + this.Yen10 + this.Yen5 + this.Yen1;
  }

  //総額
  public int GetAmount(){
    int sum = 0;
    sum = this.Yen500 * 500 + this.Yen100 * 100 + this.Yen50 * 50 + this.Yen10 * 10 + this.Yen5 * 5 + this.Yen1;
    return sum;
  }

  //硬貨ごとの総額
  public int GetAmount(int Yen){
    int n = 0;
    if (Yen == 500){
      n = this.Yen500 * 500;
    } else if(Yen == 100){
      n = this.Yen100 * 100;
    } else if(Yen == 50){
      n = this.Yen50 * 50;
    } else if(Yen == 10){
      n = this.Yen10 * 10;
    } else if(Yen == 5){
      n = this.Yen5 * 5;
    } else if(Yen == 1){
      n = this.Yen1;
    }
    return n;
  }
}
