# Devoir 08 : La calculatrice
Exercice sur l'utilisation des Wrappers
## CONSIGNE :
- Regardez avec attention les schémas UML et la javadoc fournis ci-dessous.
- Compléter les deux méthodes `additionne()` et `soustrait()` de la classe `Controller`

Vous devriez pouvoir utiliser l'application de calculatrice ci-dessous :

# UML :
## Diagramme des classes de l'application
```mermaid
---
title: F08-Calculatrice
---
classDiagram
class Application {
    +main(String[] args)$ void
}
class Controller {
   -View view
   -ServiceMath serviceMath
   +Controller()    
   +start() void
   +additionne(String a, String b, boolean isEntier) void
   +soustrait(String a, String b, boolean isEntier) void
}
class View {
   -TextField inputA
   -TextField inputB
   -Label label
   -RadioButton typeEntier
   -Controller controller
   -String fxml
   +View(Controller controller)
   +start()
   +handlePlusAction(ActionEvent event)
   +handleMinusAction(ActionEvent event)
   +affiche(String valeur)
}
class ServiceMath {
   +ServiceMath()
   -additionne(int a, int b) int
   -additionne(double a, double b) double
   -soustrait(int a, int b) int
   +soustrait(double a, double b) double
}
Controller "1" o--> "0..n" View : view
Controller "1" o--> "1" ServiceMath : serviceMath
Application ..> Controller : utilise
```

## Javadoc
Vous pouvez cliquer sur [ce lien pour obtenir la JavaDoc en HTML](javadoc/index.html) de l'application **Calculatrice**.


## RESTITUTION :
1. Rendre ce devoir normalement par `push` GitHub
