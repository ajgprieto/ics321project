package controllers;

import models.CartDB;
import models.Product;
import inventory.CreateInventory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Snacks;
import views.html.Beverages;
import views.html.Toys;
import views.html.Cigars;
import views.html.ShowItem;
import views.html.Cart;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render());
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result snacks() {
    return ok(Snacks.render(CreateInventory.getSnacks()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result beverages() {
    return ok(Beverages.render(CreateInventory.getBeverages()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result toys() {
    return ok(Toys.render(CreateInventory.getToys()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result cigars() {
    return ok(Cigars.render(CreateInventory.getCigars()));
  }
  
  /**
   * Displays the item info to the user.
   * 
   * @param id the items id
   * @return the page containing the item's info.
   */
  public static Result showItem(long id) {
    return ok(ShowItem.render(CreateInventory.showItem(id)));
  }
  
  public static Result showCart(long id) {
    Product prod = CreateInventory.showItem(id);
    CartDB.addToCart(prod);
    return ok(Cart.render(CartDB.showCart(), CartDB.getTotal()));
  }
  
  public static Result displayCart() {
    return ok(Cart.render(CartDB.showCart(), CartDB.getTotal()));
  }
  
  
  
}
