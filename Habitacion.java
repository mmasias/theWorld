public class Habitacion {

    public Baldosa[][] baldosas;
    public int largo, ancho;

    public Habitacion(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        baldosas = new Baldosa[this.largo][this.ancho];
        for (int i = 0; i < this.largo; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }
    }

    public void imprimir() {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < this.ancho; j++) {
                vistaBaldosa = " .oO#".charAt(this.baldosas[i][j].ver());
                System.out.print(" " + vistaBaldosa + " ");
            }
            System.out.println();
        }
        imprimeLinea();
    }

    public void ensuciar(int posicionX, int posicionY) {
        baldosas[posicionY][posicionX].ensucia();
    }

    public void imprimeLinea() {
        System.out.println("============================================================");
    }

    public void borraPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
