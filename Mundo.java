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

    public void imprimir(Gato[] gatos) {
        char vistaBaldosa;
        habitacion.borraPantalla();
        habitacion.imprimeLinea();
        for (int i = 0; i < habitacion.largo; i++) {
            for (int j = 0; j < habitacion.ancho; j++) {
                if (hayUnGato(gatos, i, j)) {
                    System.out.print(">G<");
                } else {
                    vistaBaldosa = " .oO#".charAt(habitacion.baldosas[i][j].ver());
                    System.out.print(" " + vistaBaldosa + " ");
                }
            }
            System.out.println();
        }
        habitacion.imprimeLinea();
    }

    private  boolean hayUnGato(Gato[] gatos, int i, int j) {
        for (Gato gato : gatos) {
            if (gato.posicionX == j && gato.posicionY == i) {
                return true;
            }
        }
        return false;
    }

    void empezar() {
        do {
            for (Gato gato : gatos) {
                gato.mover(habitacion);
                gato.ensuciar(habitacion);
            }
            imprimir(gatos);
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
