package views.formdata;

import java.util.ArrayList;
import java.util.List;
import models.Contact;
import play.data.validation.ValidationError;

/**
 * Simple contact form data.
 * 
 * @author AJ
 * 
 */
public class ContactFormData {

  private static final int NUM_DIGITS = 12;
  private static final int NUM_CC = 16;

  /** The first name. */
  public String firstName = "";

  /** The last name. */
  public String lastName = "";

  /** The telephone number. */
  public String telephone = "";
  
  /**The contact's id.*/
  public long id;
  
  /**The telephone type.*/
  public String telephoneType = "";
  
  /**Credit card info.*/
  public String creditCard = "";
  
  /**Email.*/
  public String email = "";
  
  /**
   * Empty, no argument constructor.
   */
  public ContactFormData() {
  }
  
  /**
   * Creates a ContactFormData from the given Contact information.
   * 
   * @param contact The contact with information that creates the ContactFormData.
   */
  public ContactFormData(Contact contact) {
    this.firstName = contact.getFirstName();
    this.lastName = contact.getLastName();
    this.telephone = contact.getNumber();
    this.telephoneType = contact.getTelephoneType();
    this.creditCard = contact.getCC();
    this.email = contact.getEmail();
  }
  
  /**
   * public List<ValidationError> validate()
   * 
   * Validates that info given is correct and not empty.
   * 
   * @return List of errors if applicable.
   */
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
    if (!TelephoneTypes.isType(telephoneType)) {
      error.add(new ValidationError("telephoneType", "The telephone type is invalid."));
    }
    if (creditCard.length() != NUM_CC || creditCard == null) {
      error.add(new ValidationError("creditCard", "No Credit Card info was entered."));
    }
    return error.isEmpty() ? null : error;
  }

}
