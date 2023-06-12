package Modelo;

public class Habitacion {

    private Baldosa[][] baldosas;
    public Tamaño tamaño;

    public Habitacion(Tamaño tamaño) {
        this.tamaño = tamaño;
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

    public Baldosa[][] getBaldosas(){
        return baldosas;
    }

    public void ensuciar(Posicion posicion) {
        baldosas[posicion.getY()][posicion.getX()].ensucia();
    }
}

