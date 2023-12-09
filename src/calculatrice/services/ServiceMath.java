package calculatrice.services;

/**
 * Classe représentant le serviceMath de l'application MVC "Calculatrice" du module D400.
 *
 * @author <a href="mailto:mario.ramalho@edufr.ch">Mario Ramalho</a>
 * @since 09.12.2023
 * @version 1.0.0
 */
public class ServiceMath {

    /**
     * Le constructeur de la classe ServiceMath. Toujours initialiser TOUS les attributs !
     * Mais ici, il n'y a pas d'attributs à initialiser.
     */
    public ServiceMath() {
    }

    /**
     * Méthode d'addition de deux entiers.
     *
     * @param a la valeur de l'opérande A
     * @param b la valeur de l'opérande B
     * @return la somme des deux opérandes
     */
    public int additionne(int a, int b) {
        return a + b;
    }
    /**
     * Méthode d'addition de deux réels.
     *
     * @param a la valeur de l'opérande A
     * @param b la valeur de l'opérande B
     * @return la somme des deux opérandes
     */
    public double additionne(double a, double b) {
        return a + b;
    }

    /**
     * Méthode de soustraction de deux entiers.
     *
     * @param a la valeur de l'opérande A
     * @param b la valeur de l'opérande B
     * @return la différence des deux opérandes
     */
    public int soustrait(int a, int b) {
        return a - b;
    }

    /**
     * Méthode de soustraction de deux réels.
     *
     * @param a la valeur de l'opérande A
     * @param b la valeur de l'opérande B
     * @return la différence des deux opérandes
     */
    public double soustrait(double a, double b) {
        return a - b;
    }

}
