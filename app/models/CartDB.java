package models;

import java.util.ArrayList;
import java.util.List;

public class CartDB {
  static List<Soda> cart = new ArrayList<>();
  
  public static void add(String item, String price) {
    Soda soda = new Soda(item, price);
    cart.add(soda);
  }
  
  public static List<Soda> getCart() {
    return cart;
  }
  
  public static void buyItem(String item, String price) {
    CartDB.add(item, price);    
  }
  
}
