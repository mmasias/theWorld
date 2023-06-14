import java.util.Scanner;

public class Mundo {
    private Habitacion habitacion;
    private Gato gato;

    public Mundo() {
        habitacion = new Habitacion(15, 20);
        gato = new Gato(habitacion);
    }

    public void empezar() {
        Scanner entrada = new Scanner(System.in);
        do {
            gato.mover(habitacion);
            gato.ensuciar(habitacion);
            habitacion.imprimir(gato);
            System.out.println("Para salir del programa, ingrese la letra 'f'");
        } while (!entrada.nextLine().equalsIgnoreCase("f"));
    }

    public static void main(String[] args) {
        new Mundo().empezar();
    }
}