package edu.lenin.model.domain;

import edu.lenin.model.repository.UserRepository;

public class LoginManager {
  private UserRepository userRepository;

  public LoginManager(UserRepository userRepository) {
    this.userRepository = userRepository;
  }
  
  public boolean login(String username, String password) {
    User user = userRepository.getUser(username);
    if (user.equals(User.getNullUser())) {
      return false;
    }
    return user.getPassword().equals(password);
  }
}
