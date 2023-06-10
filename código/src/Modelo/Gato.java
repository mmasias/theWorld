package Modelo;

public class Gato {

    public Posicion posicion = new Posicion();
    private Tamaño tamañoHabitacion;

    public Gato(Tamaño tamañoHabitación) {

        this.tamañoHabitacion = tamañoHabitación;
        posicion.setX((int) (Math.random() * tamañoHabitación.getAncho()));
        posicion.setY( (int) (Math.random() * tamañoHabitación.getLargo()));
    }

    public void mover() {
        double aleatorio = Math.random();
        if (aleatorio < .25 && posicion.getX() + 1 < tamañoHabitacion.getAncho()) {
            posicion.setX(posicion.getX()+1);
        } else if (aleatorio < .5 && posicion.getX() > 0) {
            posicion.setX(posicion.getX()-1);
        } else if (aleatorio < .75 && posicion.getY() + 1 < tamañoHabitacion.getLargo()) {
            posicion.setY(posicion.getY()+1);
        } else if (aleatorio < 1 && posicion.getY() > 0) {
            posicion.setY(posicion.getY()-1);
        }
    }

    public void ensuciar(Habitacion habitacion) {
        if (Math.random() > .75) {
            habitacion.ensuciar(posicion);

        }
    }
}
