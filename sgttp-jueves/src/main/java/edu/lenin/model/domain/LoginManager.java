package edu.lenin.model.domain;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import edu.lenin.model.repository.UserRepository;

public class LoginManager extends UnicastRemoteObject implements LoginManagerSkeleton {

  private static final long serialVersionUID = 123L;  

  public LoginManager() throws RemoteException {
    super();
  }
  
  public boolean login(String username, String password) throws RemoteException {
    UserRepository userRepository = new UserRepository("../../../../database/user.json");
    User user = userRepository.getUser(username);
    if (user.equals(User.getNullUser())) {
      return false;
    }
    return user.getPassword().equals(password);
  }
}
