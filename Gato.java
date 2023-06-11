public class Gato {
    private int posicionX;
    private int posicionY;
    
    public Gato(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
public void mover(Direccion direccion) {
        switch (direccion) {
            case ARRIBA:
                if (posicionY > 0) {
                    posicionY--;
                }
                break;
                
            case ABAJO:
                if (posicionY < habitacion.getAncho() - 1) {
                    posicionY++;
                }
                break;
                
            case IZQUIERDA:
                if (posicionX > 0) {
                    posicionX--;
                }
                break;
                
            case DERECHA:
                if (posicionX < habitacion.getLargo() - 1) {
                    posicionX++;
                }
                break;
                
            default:
                System.out.println("Dirección inválida");
        }
    }
    
    public void ensuciar(Habitacion habitacion) {
        habitacion.ensuciar(posicionX, posicionY);
    }
}

public enum Direccion {
    ARRIBA,
    ABAJO,
    IZQUIERDA,
    DERECHA
}