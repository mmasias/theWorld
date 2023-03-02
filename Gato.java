public class Gato {
    public Posicion posicion = new Posicion();
    public Gato(Habitacion habitacion) {
        posicion.posicionX = (int) (Math.random() * habitacion.ancho);
        posicion.posicionY = (int) (Math.random() * habitacion.largo);
    }

    public void mover(Habitacion habitacion) {
        double aleatorio = Math.random();
        if (aleatorio < .25 && posicion.posicionX + 1 < habitacion.ancho) {
            posicion.posicionX++;
        } else if (aleatorio < .5 && posicion.posicionX > 0) {
            posicion.posicionX--;
        } else if (aleatorio < .75 && posicion.posicionY + 1 < habitacion.largo) {
            posicion.posicionY++;
        } else if (aleatorio < 1 && posicion.posicionY > 0) {
            posicion.posicionY--;
        }
    }

    public void ensuciar(Habitacion habitacion) {
        if (Math.random() > .75) {
            habitacion.ensuciar(posicion.posicionX, posicion.posicionY);
        }
    }
}
