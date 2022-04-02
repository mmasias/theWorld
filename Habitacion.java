public class Habitacion {

    Baldosa[][] baldosas;
    public int largo, ancho;

    public Habitacion(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        baldosas=new Baldosa[largo][ancho];
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }        
    }

    public void imprimir() {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();        
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                vistaBaldosa = " .oO#".charAt(this.baldosas[i][j].ver());
                System.out.print("["+vistaBaldosa+"]"); 
            }
            System.out.println();
        }
        imprimeLinea();
    }

    public void imprimir(Gato gato) {
        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                if ((gato.posicionX==j) && (gato.posicionY==i)) {
                    System.out.print(">G<");
                } else {
                    vistaBaldosa = " .oO#".charAt(this.baldosas[i][j].ver());
                    System.out.print(" "+vistaBaldosa+" "); 
                }
            }
            System.out.println();
        }
        imprimeLinea();
    }

    public void ensuciar(int posicionX, int posicionY){
        if (this.baldosas[posicionY][posicionX].baldosa<4) {
            this.baldosas[posicionY][posicionX].baldosa++;
        }
    }

    private void imprimeLinea(){
        for (int j=0;j<this.ancho;j++) {System.out.print("===");} System.out.println();
    }

    private void borraPantalla(){
        System.out.print("\033[H\033[2J");System.out.flush();
    }

}

