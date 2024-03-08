package edu.lenin.model.domain;

import edu.lenin.model.repository.UserRepository;

public class Validator {

  public boolean validateLogin(String username, String password) {
    UserRepository userRepository = new UserRepository("../../database/users.json");
    User user = userRepository.getUser(username);
    if (user.equals(User.getNullUser())) {
      return false;
    }
    return user.getPassword().equals(password);
  }
  
}
