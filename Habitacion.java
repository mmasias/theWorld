public class Habitacion {

    private Baldosa[][] baldosas;
    public int largo, ancho;
    public Gato[] gatos;

    public Habitacion(int largo, int ancho, int cantidadDeGatos) {
        this.largo = largo;
        this.ancho = ancho;
        gatos = new Gato[cantidadDeGatos];
        for (int i = 0; i < cantidadDeGatos; i++) {
            this.gatos[i] = new Gato(this);
        }

        baldosas = new Baldosa[this.largo][this.ancho];
        for (int i = 0; i < this.largo; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }
    }

    private void imprimir() {
        borraPantalla();
        imprimeLinea();
        imprimirHabitacion();
        imprimeLinea();
    }

    private void imprimirHabitacion() {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (hayGatoEnBaldosa(i, j)) {
                    System.out.print(" \uD83D\uDE3A");
                } else {
                    char vistaBaldosa = " .oO#".charAt(baldosas[i][j].ver());
                    System.out.print(" " + vistaBaldosa + " ");
                }
            }
            System.out.println();
        }
    }

    private boolean hayGatoEnBaldosa(int i, int j) {
        for(Gato gato: gatos){
            if (gato.posicionX == j && gato.posicionY == i) return true;
        }
        return false;
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

    public void pasarCiclo(){
        for(Gato gato: gatos){
            gato.mover();
            gato.ensuciar(baldosas[gato.posicionY][gato.posicionX]);
        }
        imprimir();
    }
}