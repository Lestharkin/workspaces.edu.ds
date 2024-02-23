package edu.lenin.controller;

import edu.lenin.model.SGTTPModel;
import edu.lenin.view.SGTTPView;

public class SGTTPController {

  private SGTTPModel model;
  private SGTTPView view;

  public SGTTPController(SGTTPModel model, SGTTPView view) {
    this.model = model;
    this.view = view;
  }

  public void start() {
    view.init(new String[]{model.getTitle()});
  }
  
}
