package ctrl;

import services.ServiceMath;
import views.View;

public class Controller {

    private final View view;
    private final ServiceMath serviceMath;

    public Controller() {
        view = new View(this);
        serviceMath = new ServiceMath();
    }

    public void start() {
        view.start();
    }

    public void additionne(int a, int b) {
        int result = serviceMath.additionne(a, b);
        if (result % 2 == 0) {
            view.afficheVert(a + " + " + b + " = " + result);
        } else {
            view.afficheBleu(a + " + " + b + " = " + result);
        }
    }
}
