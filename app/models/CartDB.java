package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Holds the items the user adds to the cart.
 * 
 * @author AJ
 *
 */
public class CartDB {

  static List<Product> cart = new ArrayList<>();
  static double total = 0;
  
  /**
   * Adds the product to the cart.
   * @param product the cart to be added.
   */
  public static void addToCart(Product product) {
    cart.add(product);
    String price = product.getPrice();
    total += Double.parseDouble(price);
  }
  
  /**
   * Displays the cart to the user.
   * @return cart the cart of the user.
   */
  public static List<Product> showCart() {
    return cart;
  }
  
  /**
   * Returns the total as *.**.
   * @return the total formatted
   */
  public static String getTotal() {
    return String.format("%.2f", total);
  }
  
  public static void resetTotal() {
    total = 0;
  }
}
