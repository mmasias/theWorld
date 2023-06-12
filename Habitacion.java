public class Habitacion {
    private Baldosa[][] baldosas;
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

    public void imprimir(Gato[] arraygatos) {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (comprobarGato(j,i,arraygatos)==true) {
                    System.out.print(">G<");
                } else {
                    vistaBaldosa = " .oO#".charAt(baldosas[i][j].ver());
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
    private boolean comprobarGato(int posicionX, int posicionY,Gato[] arrayGatos) {
        for (Gato gato : arrayGatos) {
            if(posicionX == gato.posicion.posicionX && posicionY == gato.posicion.posicionY){
                return true;
            }
        }
        return false;
    }
}
