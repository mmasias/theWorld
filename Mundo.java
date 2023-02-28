import java.util.Scanner;

class Mundo {

    private Habitacion habitacion;

    public Mundo() {
        habitacion = new Habitacion(15, 20);
    }

    void empezar() {
        do {
            habitacion.gato.mover();
            habitacion.ensuciar();
            habitacion.imprimir();
        } while (quiereSeguir());
    }

    boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    public static void main(String[] args) {
        new Mundo().empezar();
    }
}