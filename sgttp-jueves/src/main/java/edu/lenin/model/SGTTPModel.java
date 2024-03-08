package edu.lenin.model;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import edu.lenin.model.domain.LoginManager;
import edu.lenin.model.domain.LoginManagerSkeleton;

public class SGTTPModel {

  private String ip;
  private String port;
  private String serviceName;
  private String uri;

  public SGTTPModel(String ip, String port, String serviceName) {
    this.ip = ip;
    this.port = port;
    this.serviceName = serviceName;
    // "//192.168.0.1:1802/service"
    this.uri = "//" + this.ip + ":" + this.port + "/" + this.serviceName;
  }

  public boolean deploy() {
    try {
      System.setProperty("java.rmi.server.hostname", ip);
      LoginManagerSkeleton loginManagerService = new LoginManager();   
      LocateRegistry.createRegistry(Integer.parseInt(port));
      Naming.rebind(uri, loginManagerService);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return false;
  }
  
}
