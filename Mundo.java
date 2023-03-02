import java.util.Scanner;

public class Mundo {
    private Habitacion habitacion;
    private Gato gato1;
    private Gato gato2;
    private Gato gato3;


    public Mundo() {
        habitacion = new Habitacion(15, 20);
        gato1 = new Gato(habitacion);
        gato2 = new Gato(habitacion);
        gato3 = new Gato(habitacion);

    }

    void empezar() {
        do {
            gato1.mover(habitacion);
            gato2.mover(habitacion);
            gato3.mover(habitacion);
            gato1.ensuciar(habitacion);
            gato2.ensuciar(habitacion);
            gato3.ensuciar(habitacion);
            habitacion.imprimir(gato1,gato2,gato3);
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
