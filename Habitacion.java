public class Habitacion {

    private Baldosa[][] baldosas;
    public int largo, ancho;
    public Gato gato;

    public Habitacion(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.gato = new Gato(this);
        baldosas = new Baldosa[this.largo][this.ancho];
        for (int i = 0; i < this.largo; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }
    }

    public void imprimir() {
        borraPantalla();
        imprimeLinea();
        imprimirHabitacion();
        imprimeLinea();
    }

    private void imprimirHabitacion() {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (gato.posicionX == j && gato.posicionY == i) {
                    System.out.print(" \uD83D\uDE3A");
                } else {
                    char vistaBaldosa = " .oO#".charAt(baldosas[i][j].ver());
                    System.out.print(" " + vistaBaldosa + " ");
                }
            }
            System.out.println();
        }
    }

    public void ensuciar() {
        if (Math.random() > .75) {
            baldosas[gato.posicionY][gato.posicionX].ensucia();
        }
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
}