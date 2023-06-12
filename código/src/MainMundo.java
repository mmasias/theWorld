import Controlador.Mundo;
import Modelo.Tamaño;

public class MainMundo {

    public static void main(String[] args) {

        Tamaño tamaño = new Tamaño(20,15);

        new Mundo(4, tamaño).empezar();
    }

}
