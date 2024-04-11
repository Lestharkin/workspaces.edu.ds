package edu.lenin.model;

import java.rmi.Naming;

import edu.lenin.model.domain.LoginManagerStub;

public class SGTTPClientModel {
  LoginManagerStub loginManager;
  String uri;

  public SGTTPClientModel(String ipService, String portService, String serviceName) {
    this.uri = "rmi://" + ipService + ":" + portService + "/" + serviceName;
  }
  
  public boolean login(String username, String password) {
    try {
      loginManager = (LoginManagerStub) Naming.lookup(uri);
      return loginManager.login(username, password);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }
}
