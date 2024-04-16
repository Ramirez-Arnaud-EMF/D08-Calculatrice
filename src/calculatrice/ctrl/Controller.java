package calculatrice.ctrl;

import calculatrice.services.ServiceMath;
import calculatrice.views.View;

/**
 * Classe représentant le contrôleur de l'application MVC "Calculatrice" du module D400.
 *
 * @author <a href="mailto:mario.ramalho@edufr.ch">Mario Ramalho</a>
 * @since 09.12.2023
 * @version 1.0.0
 */
public class Controller {

    private final View view;
    /**
     * Le constructeur de la classe Controller. Toujours initialiser TOUS les attributs !
     */
    public Controller() {
        view = new View(this);
        new ServiceMath();
    }

    /**
     * Méthode de démarrage de l'application MVC. La méthode commence par appeler la méthode start() de la vue afin
     * de la démarrer.
     */
    public void start() {
        view.start();
    }

    /**
     * Méthode appelée par la vue lorsque l'utilisateur clique sur le bouton "+". 
     * Cette méthode appelle le service métier serviceMath pour effectuer l'opération.
     * Si les opérandes sont des entiers, on appelle la méthode additionne(int, int) du service métier.
     * Si les opérandes sont des réels, on appelle la méthode additionne(double, double) du service métier.
     * Le résultat est ensuite affiché dans la vue.
     *
     * @param a la valeur de l'opérande A
     * @param b la valeur de l'opérande B
     * @param isEntier true si les opérandes sont des entiers, false si ce sont des réels
     */
    public void additionne(String a, String b, boolean isEntier) {
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        isEntier = true;

        double result = number1 + number2;

        if (result < 0) {
            isEntier = false;
        }

        String finalResult = Double.toString(result);


        view.affiche(finalResult);
    }

    /**
     * Méthode appelée par la vue lorsque l'utilisateur clique sur le bouton "-". 
     * Cette méthode appelle le service métier serviceMath pour effectuer l'opération.
     * Si les opérandes sont des entiers, on appelle la méthode additionne(int, int) du service métier.
     * Si les opérandes sont des réels, on appelle la méthode additionne(double, double) du service métier.
     * Le résultat est ensuite affiché dans la vue.
     *
     * @param a la valeur de l'opérande A
     * @param b la valeur de l'opérande B
     * @param isEntier true si les opérandes sont des entiers, false si ce sont des réels
     */
    public void soustrait(String a, String b, boolean isEntier) {
        double number1 = Double.parseDouble(a);
        double number2 = Double.parseDouble(b);
        isEntier = true;

        double result = number1 - number2;

        if (result < 0) {
            isEntier = false;
        }

        String finalResult = Double.toString(result);

  
        view.affiche(finalResult);
    }
}
