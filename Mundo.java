import java.util.Scanner;

class Mundo {

    private Habitacion habitacion;
    private Gato[] gatos;

    public Mundo(int numeroGatos) {
        habitacion = new Habitacion(15, 20);

        gatos = new Gato[numeroGatos];
        for (int gato = 0; gato < numeroGatos; gato++) {
            gatos[gato] = new Gato(habitacion);
        }
    }

    void empezar() {
        do {
            for (Gato gato : gatos) {
                gato.mover(habitacion);
                gato.ensuciar(habitacion);
            }
            habitacion.imprimir(gatos);
        } while (quiereSeguir());
    }

    boolean quiereSeguir() {
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    static int preguntaEntero(){
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }
}