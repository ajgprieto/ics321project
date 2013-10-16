package models;

import java.util.ArrayList;
import java.util.List;
import views.formdata.UserFormData;

/**
 * Keeps a list of the users.
 * 
 * @author AJ
 *
 */
public class UserDB {

  static List<User> users = new ArrayList<>();
  
  /**
   * Adds a new user to the database.
   * 
   * @param user the user to be entered into the database.
   */
  public static void add(UserFormData user) {
    User newUser = new User(user.firstName, user.lastName, user.telephone, user.eMail);
    users.add(newUser);
  }
  
  /**
   * Returns the list of users.
   * 
   * @return the list of users.
   */
  public static List<User> getUsers() {
    return users;
  }
}
