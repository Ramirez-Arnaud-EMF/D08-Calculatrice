package app;

import ctrl.Controller;

/**
 * Modèle d'application "MVC" réalisé sans interfaces (qui sont vues au 226a)
 * avec ihm JavaFX.
 *
 * @author EMF-Informatique
 */
public class Application {

    public static void main(String[] args) {
        new Controller().start();
    }

}
