package models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CartDB {

  static List<Product> cart = new ArrayList<>();
  static double total = 0;
  
  public static void addToCart(Product product) {
    cart.add(product);
    String price = product.getPrice();
    total += Double.parseDouble(price);
  }
  
  public static List<Product> showCart() {
    return cart;
  }
  
  public static String getTotal() {
    return String.format("%.2f", total);
  }
}
