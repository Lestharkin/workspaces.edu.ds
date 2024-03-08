package edu.lenin.controller;

import edu.lenin.model.SGTTPModel;
import edu.lenin.view.SGTTPView;

public class SGTTPController {

  private SGTTPModel model;
  private  SGTTPView view;

  public SGTTPController(SGTTPModel model, SGTTPView view) {
    this.model = model;
    this.view = view;
  }

  public void start() {
    this.view.initComponent(event -> {
      this.view.showServerStatus("Server started");
      this.model.deploy();
      return null;
    });
  }
  
}
