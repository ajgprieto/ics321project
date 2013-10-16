package models;

/**
 * Creates a new user.
 * 
 * @author AJ
 *
 */
public class User {
  
  private String firstName;
  private String lastName;
  private String telephone;
  private String eMail;
  
  /**
   * Creates a new user using the given info.
   * 
   * @param firstName the first name.
   * @param lastName the last name
   * @param telephone the telephone number
   * @param eMail the email address
   */
  public User(String firstName, String lastName, String telephone, String eMail) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.eMail = eMail;
  }
  
  /**
   * Retuns the first name.
   * 
   * @return the first name.
   */
  public String getFirst() {
    return firstName;
  }
  
  /**
   * Returns the last name.
   * 
   * @return the last name.
   */
  public String getLast() {
    return lastName;
  }
  
  /**
   * Returns the telephone number.
   * 
   * @return the telephone number.
   */
  public String getTelephone() {
    return telephone;
  }
  
  /**
   * Returns the email address.
   * 
   * @return the email address.
   */
  public String getEmail() {
    return eMail;
  }
}
