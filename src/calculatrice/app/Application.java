 package calculatrice.app;

import calculatrice.ctrl.Controller;

/**
 * Classe représentant l'application MVC de l'application "Calculatrice" du module D400.
 *
 * @author <a href="mailto:mario.ramalho@edufr.ch">Mario Ramalho</a>
 * @since 09.12.2023
 * @version 1.0.0
 */
public class Application {

    /**
     * LA méthode main() de l'application, là où tout commence mais... tout se finit-il bien là ?
     *
     * @param args les arguments du programme passés sur la ligne de commande
     */
    public static void main(String[] args) {

        // Création du contrôleur et démarrage de l'application
        new Controller().start();
    }

}
