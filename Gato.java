public class Gato {

    public int posicionX, posicionY;
    private Habitacion habitacion;

    public Gato(Habitacion habitacion) {
        this.habitacion = habitacion;
        posicionX = (int) (Math.random() * habitacion.ancho);
        posicionY = (int) (Math.random() * habitacion.largo);
    }

    public void mover() {
        double aleatorio = Math.random();
        if (aleatorio < .25 && posicionX + 1 < habitacion.ancho) {
            posicionX++;
        } else if (aleatorio < .5 && posicionX > 0) {
            posicionX--;
        } else if (aleatorio < .75 && posicionY + 1 < habitacion.largo) {
            posicionY++;
        } else if (posicionY > 0) {
            posicionY--;
        }
    }

    public void ensuciar(Baldosa baldosa) {
        if (Math.random() > .75) {
            baldosa.ensuciar();
        }
    }
}