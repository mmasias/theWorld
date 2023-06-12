public class Habitacion {
    private Baldosa[][] baldosas;
    private int largo;
    private int ancho;
    
    public Habitacion(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        baldosas = new Baldosa[largo][ancho];
        
        // Inicializar todas las baldosas en la habitación
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                baldosas[i][j] = new Baldosa();
            }
        }
    }
    
    public void imprimir() {
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(baldosas[i][j].ver() + " ");
            }
            System.out.println();
        }
    }
    
    public void ensuciar(int posicionX, int posicionY) {
        if (posicionX >= 0 && posicionX < largo && posicionY >= 0 && posicionY < ancho) {
            baldosas[posicionX][posicionY].ensuciar();
        }
    }
}