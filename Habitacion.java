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
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                System.out.print("["+this.baldosas[i][j].ver()+"]"); 
            }
            System.out.println();
        }
    }

    public void imprimir(Gato gato) {
        borraPantalla();
        imprimeLinea();
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                if ((gato.posicionX==j) && (gato.posicionY==i)) {
                    System.out.print(">G<");
                } else {
                    System.out.print("["+this.baldosas[i][j].ver()+"]"); 
                }
            }
            System.out.println();
        }
        imprimeLinea();
    }

    public void ensuciar(int posicionX, int posicionY){
        this.baldosas[posicionY][posicionX].baldosa='#';
    }

    private void imprimeLinea(){
        for (int j=0;j<this.ancho;j++) {System.out.print("===");} System.out.println();
    }

    private void borraPantalla(){
        System.out.print("\033[H\033[2J");System.out.flush();
    }

}

