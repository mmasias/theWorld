public class Habitacion {

    private Baldosa[][] baldosas;
    public Tamaño tamaño;

    public Habitacion(int ancho, int largo) {
        this.tamaño = new Tamaño(ancho, largo);
        crearBaldosas();
    }

    private void crearBaldosas() {
        baldosas = new Baldosa[tamaño.getLargo()][tamaño.getAncho()];

        for (int i = 0; i < tamaño.getLargo(); i++) {
            for (int j = 0; j < tamaño.getAncho(); j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }
    }

    public void imprimir() {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < tamaño.getLargo(); i++) {
            for (int j = 0; j < tamaño.getAncho(); j++) {
                vistaBaldosa = " .oO#".charAt(this.baldosas[i][j].ver());
                System.out.print(" " + vistaBaldosa + " ");
            }
            System.out.println();
        }
        imprimeLinea();
    }

    public void imprimir(Gato[] gatos) {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < tamaño.getLargo() ; i++) {
            for (int j = 0; j < tamaño.getAncho() ; j++) {
                if (gatoEnBaldosa(i, j, gatos)) {
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

    private boolean gatoEnBaldosa(int i, int j, Gato[] gatos) {

        for(Gato gato: gatos){
            if (gato.posicion.getX() == j && gato.posicion.getY() == i) return true;
        }
        return false;
    }

    private void imprimeLinea() {
        for (int j = 0; j < tamaño.getAncho(); j++) {
            System.out.print("===");
        }
        System.out.println();
    }

    private void borraPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void ensuciar(Posicion posicion) {
        baldosas[posicion.getY()][posicion.getX()].ensucia();
    }
}

