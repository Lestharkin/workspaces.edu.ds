package edu.lenin.controller;

import com.lestharkin.util.array.Array;

import edu.lenin.model.SGTTPClientModel;
import edu.lenin.view.SGTTPClientView;

public class SGTTPClientController {
  private SGTTPClientModel model;
  private SGTTPClientView view;

  public SGTTPClientController(SGTTPClientModel model, SGTTPClientView view) {
    this.model = model;
    this.view = view;
  }

  public void start() {
    boolean op = true;
    do {
      Array<String> loginData = this.view.showLoginConsole();
      if (this.model.login(loginData.get(0), loginData.get(1))) {
        this.view.showMainConsole();
        op = false;
      } else {
        op = this.view.showLoginError();
      }
    } while (op);
  }

}
