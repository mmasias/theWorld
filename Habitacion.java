public class Habitacion {
    private Baldosa[][] baldosas;
    private int largo;
    private int ancho;

    public Habitacion(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        baldosas = new Baldosa[largo][ancho];
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                baldosas[i][j] = new Baldosa();
            }
        }
    }

    public void imprimir(Gato gato) {
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (gato.getPosicionX() == j && gato.getPosicionY() == i) {
                    System.out.print(">G<");
                } else {
                    char vistaBaldosa = " .oO#".charAt(baldosas[i][j].ver());
                    System.out.print(" " + vistaBaldosa + " ");
                }
            }
            System.out.println();
        }
        imprimeLinea();
    }

    public void ensuciar(int posicionX, int posicionY) {
        baldosas[posicionY][posicionX].ensucia();
    }

    private void imprimeLinea() {
        for (int j = 0; j < ancho; j++) {
            System.out.print("===");
        }
        System.out.println();
    }

    private void borraPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }
}