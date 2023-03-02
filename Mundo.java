import java.util.Scanner;

class Mundo {
    private Habitacion habitacion;
    private Gato gato;

    public Mundo() {
        habitacion = new Habitacion(15, 20);
        gato = new Gato(habitacion);
    }

    void empezar() {
        do {
            gato.mover(habitacion);
            gato.ensuciar(habitacion);
            habitacion.imprimir(gato);
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
