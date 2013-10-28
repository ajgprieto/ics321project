package models;

public class Soda {

  String soda = "";
  String price = "";
  
  public Soda() {}
  
  public Soda (String soda, String price) {
    this.soda = soda;
    this.price = price;
  }
  
  public String getSoda() {
    return soda;
  }
  
  public String getPrice() {
    return price;
  }
}
