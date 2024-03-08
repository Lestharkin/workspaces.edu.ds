package edu.lenin.model.domain;

public class Validator {

  public boolean validateLogin(String username, String password) {
    User user = new User();
    if (user.getPassword().equals(password)){
      return true;
    }
    return false;
  }
  
}
