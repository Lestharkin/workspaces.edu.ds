package edu.lenin;

import edu.lenin.controller.SGTTPController;
import edu.lenin.model.SGTTPModel;
import edu.lenin.view.SGTTPView;

/**
 * Hello world!
 *
 */
public class SGTTP {
    public static void main(String[] args) {
        SGTTPController controller = new SGTTPController(new SGTTPModel(), new SGTTPView());
        controller.start();
    }
}
