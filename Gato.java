public class Gato {

    public int posicionX, posicionY;

    public Gato(Habitacion habitacion) {
        posicionX = (int) (Math.random() * habitacion.ancho);
        posicionY = (int) (Math.random() * habitacion.largo);
    }

    public void mover(Habitacion habitacion) {
        double aleatorio = Math.random();
        if (aleatorio < .25 && posicionX + 1 < habitacion.ancho) {
            posicionX++;
        } else if (aleatorio < .5 && posicionX > 0) {
            posicionX--;
        } else if (aleatorio < .75 && posicionY + 1 < habitacion.largo) {
            posicionY++;
        } else if (aleatorio < 1 && posicionY > 0) {
            posicionY--;
        }
    }

    public void ensuciar(Habitacion habitacion) {
        if (Math.random() > .75) {
            habitacion.ensuciar(posicionX, posicionY);
        }
    }
}