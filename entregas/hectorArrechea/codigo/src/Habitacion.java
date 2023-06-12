public class Habitacion {

    private Baldosa[][] baldosas;
    private int largo, ancho;

    private Gato[] gatos;

    public Habitacion(int largo, int ancho, int cantidadDeGatos){
        this.largo = largo;
        this.ancho = ancho;
        this.gatos = new Gato[cantidadDeGatos];
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

    public void pasarTiempo(){
        for (int i = 0; i < gatos.length; i++) {
            gatos[i].mover(this);
            gatos[i].ensuciar(this);
        }
        this.imprimir();
    }

    private void imprimir() {
        char vistaBaldosa;
        Consola.limpiaConsola();
        Consola.imprimeLinea(ancho);
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                if (buscarGato(j, i) != null) {
                    Consola.imprimir(">G<");
                } else {
                    vistaBaldosa = " .oO#".charAt(baldosas[i][j].getEstado());
                    Consola.imprimir(" " + vistaBaldosa + " ");
                }
            }
            System.out.println();
        }
        Consola.imprimeLinea(ancho);
    }

    private Gato buscarGato(int posicionX, int posicionY) {
        for (int i = 0; i < gatos.length; i++) {
            if (gatos[i].posicionX == posicionX && gatos[i].posicionY == posicionY) {
                return gatos[i];
            }
        }
        return null;
    }

    public int getLargo(){
        return this.largo;
    }

    public int getAncho(){
        return this.ancho;
    }
    public void ensuciar(int posicionX, int posicionY) {
            baldosas[posicionY][posicionX].aumentaSuciedad();
    }
}