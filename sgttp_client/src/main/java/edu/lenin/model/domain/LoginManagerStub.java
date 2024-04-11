package edu.lenin.model.domain;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginManagerStub extends Remote  {
  public boolean login(String username, String password) throws RemoteException;
}
