public class Habitacion {

    private int _ARRIBA = 1;
    private int _ABAJO = 2;
    private int _DERECHA = 3;
    private int _IZQUIERDA = 4;

    private Baldosa[][] baldosas;
    private Gato[] gatos;
    public int largo, ancho;
    

    public Habitacion(int largo, int ancho, int cantidadGatos) {
        this.largo = largo;
        this.ancho = ancho;
        baldosas = new Baldosa[this.largo][this.ancho];
        for (int i = 0; i < this.largo; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }   

        gatos = new Gato[cantidadGatos];
        for (int i = 0; i < gatos.length; i++){
            gatos[i] = new Gato();
        }
    }

    public void avanzaDia(){
        for (int i = 0; i < gatos.length; i++){
            int posicionMoverseGato = gatos[i].dondeQuieresMoverte();

            if (posicionMoverseGato == _ARRIBA /*&& noEstaFueraDeRango*/)
                System.out.println("arriba");
            
            else if (posicionMoverseGato == _ABAJO)
                System.out.println("abajo");
            
            else if (posicionMoverseGato == _DERECHA)
                System.out.println("derecha");
            
            else
                System.out.println("abajo");  
        }

        for (int i = 0; i < baldosas.length; i++){
            for (int j = 0; j < baldosas[i].length; j++){
                if (baldosas[i][j].)
                //comprobar si en la baldosa hay un gato
            }
        }
        for (int i = 0; i < gatos.length; i++){
            boolean ensucia = gatos[i].VasAEnsuciar;
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

    public void imprimir(Gato gato) {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (gato.posicionX == j && gato.posicionY == i) {
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
}