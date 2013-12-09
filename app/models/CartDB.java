package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import play.db.ebean.Model;

/**
 * Holds the items the user adds to the cart.
 * 
 * @author AJ
 * 
 */
public class CartDB {

  
  static double total = 0;
  static List<Product> cart = new ArrayList<>();

  /**
   * Adds the product to the cart.
   * 
   * @param product the cart to be added.
   */
  public static void addToCart(Product product) {
    cart.add(product);
    String price = product.getPrice();
    total += Double.parseDouble(price);
  }

  public static void removeItem(Product product) {
    cart.remove(product);
    total -= Double.parseDouble(product.getPrice());
  }

  /**
   * Displays the cart to the user.
   * 
   * @return cart the cart of the user.
   */
  public static List<Product> showCart() {
    return cart;
  }

  /**
   * Returns the total as *.**.
   * 
   * @return the total formatted
   */
  public static String getTotal() {
    return String.format("%.2f", total);
  }

  public static void resetTotal() {
    total = 0;
  }
}
