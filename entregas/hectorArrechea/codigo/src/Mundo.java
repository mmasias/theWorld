import java.util.Scanner;

public class Mundo {

    private Habitacion habitacion;
    private static final int LARGO = 15;
    private static final int ANCHO = 20;
    private static final int CANTIDAD_DE_GATOS = 4;

    public Mundo() {
        habitacion = new Habitacion(this.LARGO, this.ANCHO, CANTIDAD_DE_GATOS);
    }

    void empezar() {
        do {
            habitacion.pasarTiempo();
        } while (Consola.quiereSeguir());
    }
    public static void main(String[] args) {
        new Mundo().empezar();
    }
}