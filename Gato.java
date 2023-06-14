
public class Gato {
    private int posicionX;
    private int posicionY;

    public Gato(Habitacion habitacion) {
        posicionX = (int) (Math.random() * habitacion.getAncho());
        posicionY = (int) (Math.random() * habitacion.getLargo());
    }

    public void mover(Habitacion habitacion) {
        double aleatorio = Math.random();
        int ancho = habitacion.getAncho();
        int largo = habitacion.getLargo();

        if (aleatorio < 0.25 && posicionX + 1 < ancho) {
            posicionX++;
        } else if (aleatorio < 0.5 && posicionX > 0) {
            posicionX--;
        } else if (aleatorio < 0.75 && posicionY + 1 < largo) {
            posicionY++;
        } else if (aleatorio < 1 && posicionY > 0) {
            posicionY--;
        }
    }

    public void ensuciar(Habitacion habitacion) {
        if(Math.random() > .75) {
            habitacion.ensuciar(posicionX, posicionY);
        }
    }

    public int getPosicionX() {
        return posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }
}
