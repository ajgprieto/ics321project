package models;

public class User {
  
  private String firstName;
  private String lastName;
  private String telephone;
  private String eMail;
  
  public User(String firstName, String lastName, String telephone, String eMail) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.telephone = telephone;
    this.eMail = eMail;
  }
  
  public String getFirst() {
    return firstName;
  }
  
  public String getLast() {
    return lastName;
  }
  
  public String getTelephone() {
    return telephone;
  }
  
  public String getEmail() {
    return eMail;
  }
}
