package models;

/**
 * Creates a model of a Contact.
 */
public class Contact {

  /** The first name. */
  private String firstName;
  /** The last name. */
  private String lastName;
  /** The telephone number. */
  private String telephone;
  /** Contact's id. */
  private long id;
  /**The telephone type.*/
  private String telephoneType;
  /**Credit card number.*/
  private String creditCard;
  /**Email.*/
  private String email;

  /**
   * public Contact(String first, String last, String phNumber
   * 
   * Creates a Contact from the given data.
   * 
   * @param id the id of the contact
   * @param first the first name
   * @param last the last name
   * @param phNumber the phone number
   * @param telephoneType the telephone type
   * @param email the email
   * @param creditCard the cc
   */
  public Contact(long id, String first, String last, String phNumber, String telephoneType, String creditCard, String email) {
    this.id = id;
    this.firstName = first;
    this.lastName = last;
    this.telephone = phNumber;
    this.telephoneType = telephoneType;
    this.creditCard = creditCard;
    this.email = email;
  }

  /**
   * Returns the first name.
   * 
   * @return the first name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Sets the first name of the contact.
   * 
   * @param name the first name
   */
  public void setFirstName(String name) {
    this.firstName = name;
  }

  /**
   * Returns the last name.
   * 
   * @return the last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * Sets the last name of the contact.
   * 
   * @param name the last name
   */
  public void setLastName(String name) {
    this.lastName = name;
  }

  /**
   * Returns the phone number.
   * 
   * @return the phone number
   */
  public String getNumber() {
    return telephone;
  }

  /**
   * Sets the number for the contact.
   * 
   * @param num the number for the contact.
   */
  public void setNumber(String num) {
    this.telephone = num;
  }

  /**
   * Returns the contact's id.
   * 
   * @return the id
   */
  public long getID() {
    return id;
  }

  /**
   * Sets the contact's id.
   * 
   * @param val the contact's id
   */
  public void setID(long val) {
    this.id = val;
  }
  
  /**
   * Returns the telephone type.
   * 
   * @return the telephone type
   */
  public String getTelephoneType() {
    return telephoneType;
  }
  
  /**
   * Sets the telephone type.
   * 
   * @param telephoneType the telephone type to be set
   */
  public void setTelephoneType(String telephoneType) {
    this.telephoneType = telephoneType;
  }
  
  /**Return cc info.
   * 
   * @return the cc
   */
  public String getCC() {
    return creditCard;
  }
  
  /**
   * sets cc info.
   * @param creditCard the new cc
   */
  public void setCC(String creditCard) {
    this.creditCard = creditCard;
  }

  /**
   * returns email.
   * @return email
   */
  public String getEmail() {
    return email;
  }
  
  /**
   * Sets email.
   * @param email the new email
   */
  public void setEmail(String email) {
    this.email = email;
  }
}
