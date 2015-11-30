package balanca;

import observer.Observer;

public class BalancaDieta implements Observer {

    @Override
    public void update(Object peso) {
        if ((Double)peso >= 80) {
            System.out.println("Você ultrapassou o peso limite no sistema!");
        }
    }

}
