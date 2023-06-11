import java.util.List;

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
    public void imprimir(List<Gato> gatos) {
        char vistaBaldosa;
        dibujar();
        for (int i = 0; i < largo; i++) {
            for (int j = 0; j < ancho; j++) {
                for(int k = 0;k< gatos.size(); k++){
                    if (gatos.get(k).posicionX == j && gatos.get(k).posicionY == i) {
                        System.out.print(gatos.get(k).dibujo);
                    } else {
                        vistaBaldosa = " .oO#".charAt(baldosas[i][j].ver());
                        System.out.print(" " + vistaBaldosa + " ");
                    }
                }

            }
            System.out.println();
        }
        dibujar();
    }

    public void ensuciar(int posicionX, int posicionY) {
        baldosas[posicionY][posicionX].ensucia();
    }

    private void dibujar() {
        for (int j = 0; j < ancho; j++) {
            System.out.print("===");
        }
        System.out.println();
    }

}

