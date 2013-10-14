package models;

import java.util.ArrayList;
import java.util.List;
import views.formdata.UserFormData;


public class UserDB {

  static List<User> users = new ArrayList<>();
  
  public static void add(UserFormData user) {
    User newUser = new User(user.firstName, user.lastName, user.telephone, user.eMail);
    users.add(newUser);
  }
  
  public static List<User> getUsers() {
    return users;
  }
}
