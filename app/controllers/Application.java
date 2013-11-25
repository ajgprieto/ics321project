package controllers;

import models.CartDB;
import models.Product;
import inventory.CreateInventory;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.ContactFormData;
import views.formdata.TelephoneTypes;
import views.html.Index;
import views.html.NewContact;
import views.html.ShowItem;
import views.html.Cart;
import views.html.Checkout;
import views.html.Categories;

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
    return ok(Categories.render("Snack", CreateInventory.getSnacks()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result beverages() {
    return ok(Categories.render("Beverages", CreateInventory.getBeverages()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result toys() {
    return ok(Categories.render("Toys", CreateInventory.getToys()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result cigars() {
    return ok(Categories.render("Cigars", CreateInventory.getCigars()));
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
  
  /**
   * Shows the cart to the user with all the added items.
   * 
   * @param id the id of the product added to the cart.
   * @return the cart
   */
  public static Result showCart(long id) {
    Product prod = CreateInventory.showItem(id);
    CartDB.addToCart(prod);
    return ok(Cart.render(CartDB.showCart(), CartDB.getTotal()));
  }
  
  public static Result deleteItem(long id) {
    Product prod = CreateInventory.showItem(id);
    CartDB.removeItem(prod);
    return ok(Cart.render(CartDB.showCart(), CartDB.getTotal()));
  }
  
  /**
   * Shows the cart to the user.
   * @return the cart displayed on the page.
   */
  public static Result displayCart() {
    return ok(Cart.render(CartDB.showCart(), CartDB.getTotal()));
  }
  
  public static Result userInfo() {
    ContactFormData data = new ContactFormData();
    Form<ContactFormData> formData = Form.form(ContactFormData.class).fill(data);
    return ok(NewContact.render(formData, TelephoneTypes.getTypes(data.telephoneType)));
  }
  
  public static Result postContact() {
    Form<ContactFormData> formData = Form.form(ContactFormData.class).bindFromRequest();

    if (formData.hasErrors()) {
      System.out.println("Errors Found");
      return badRequest(NewContact.render(formData, TelephoneTypes.getTypes()));
    }
    else {
      return ok(NewContact.render(formData, TelephoneTypes.getTypes()));
    }
  }
  
  public static Result checkout() {
    CartDB.showCart().clear();
    CartDB.resetTotal();
    return ok(Checkout.render());
  }
  
  
}
