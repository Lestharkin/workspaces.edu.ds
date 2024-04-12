package edu.lenin;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.lenin.controller.SGTTPClientController;
import edu.lenin.model.SGTTPClientModel;
import edu.lenin.view.SGTTPClientView;

/**
 * Hello world!
 *
 */
public class SGTTPClient {
    public static void main(String[] args) {
        Properties config = new Properties();
        try (FileInputStream fin = new FileInputStream(new File("config.properties"))) {
            config.load(fin);
            SGTTPClientModel model = new SGTTPClientModel(
                    (String) config.get("IP"),
                    (String) config.get("PORT"),
                    (String) config.get("SERVICE_NAME"));
            SGTTPClientController controller = new SGTTPClientController(model, new SGTTPClientView());
            controller.start();
        } catch (Exception e) {
            Logger.getLogger("AuthClient").log(Level.WARNING, e.getMessage(), e);
        }
    }
}
