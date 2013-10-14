package views.formdata;

import java.util.ArrayList;
import java.util.List;
import play.data.validation.ValidationError;

public class UserFormData {

  private static final int NUM_DIGITS = 12;
  public String firstName = "";
  public String lastName = "";
  public String telephone = "";
  public String eMail = "";
  
public List<ValidationError> validate() {
    
    List<ValidationError> error = new ArrayList<>();
    
    if (firstName == null || firstName.length() == 0) {
      error.add(new ValidationError("firstName", "First Name is required."));
    }
    if (lastName == null || lastName.length() == 0) {
      error.add(new ValidationError("lastName", "Last Name is required."));
    }
    if (telephone == null || telephone.length() == 0) {
      error.add(new ValidationError("telephone", "Telephone Number is required."));
    }
    if (telephone.length() != NUM_DIGITS) {
      error.add(new ValidationError("telephone", "Telephone Number must be 12 characters long."));
    }
    if (eMail == null)  {
      error.add(new ValidationError("eMail", "Email field cannot be empty."));
    }
    if (!eMail.contains("@") || !eMail.contains(".com")) {
      error.add(new ValidationError("eMail", "Not a valid email address."));
    }
    return error.isEmpty() ? null : error;
  }
}
