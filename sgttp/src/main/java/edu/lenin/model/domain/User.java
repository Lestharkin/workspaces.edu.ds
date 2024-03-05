package edu.lenin.model.domain;

public class User {

  private AbstractPerson person;
  private String userName;
  private String password;

  public User(AbstractPerson person, String userName, String password) {
    this.person = person;
    this.userName = userName;
    this.password = password;
  }
  public AbstractPerson getPerson() {
    return person;
  }
  public void setPerson(AbstractPerson person) {
    this.person = person;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public static User getNullUser() {
    return new User(new AbstractPerson(){}, "", "");
  }

  
  
}
