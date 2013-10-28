package controllers;

import java.util.ArrayList;
import java.util.List;
import models.CreateSodaInventory;
import models.Soda;
import models.UserDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.UserFormData;
import views.html.Index;
import views.html.Page1;
import views.html.NewUser;
import views.html.Snacks;
import views.html.Beverages;
import views.html.Toys;
import views.html.Cigars;

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
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result snacks() {
    return ok(Snacks.render("Welcome to the snacks page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result beverages() {
    CreateSodaInventory.run();
    List<Soda> sodas = CreateSodaInventory.listSoda();    
    return ok(Beverages.render(sodas));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result toys() {
    return ok(Toys.render("Welcome to the toys page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result cigars() {
    return ok(Cigars.render("Welcome to the cigars page."));
  }
  
  /**
   * Createsa  new user.
   * 
   * @return the new user
   */
  public static Result newUser() {
    Form<UserFormData> user = Form.form(UserFormData.class);
    return ok(NewUser.render(user));
  }
  
  
 /**
  * Posts a new user to the user list.
  * 
  * @return the list of users.
  */
  public static Result postUsers() {
    Form<UserFormData> formData = Form.form(UserFormData.class).bindFromRequest();

    if (formData.hasErrors()) {
      System.out.println("Errors Found");
      return badRequest(NewUser.render(formData));
    }
    else {
      UserFormData data = formData.get();
      UserDB.add(data);
      System.out.println("OK: " + data.firstName + " " + data.lastName + " " + data.telephone + " " + data.eMail);
      return ok(NewUser.render(formData));
    }
  }
}
