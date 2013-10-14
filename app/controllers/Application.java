package controllers;

import models.UserDB;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.UserFormData;
import views.html.Index;
import views.html.Page1;
import views.html.NewUser;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render(UserDB.getUsers()));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  public static Result newUser() {
    Form<UserFormData> user = Form.form(UserFormData.class);
    return ok(NewUser.render(user));
  }
  
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
