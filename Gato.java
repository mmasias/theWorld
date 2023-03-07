public class Gato {

    public Posicion posicion = new Posicion();

    public Gato(Tamaño tamañoHabitación) {

        posicion.setX((int) (Math.random() * tamañoHabitación.getAncho()));
        posicion.setY( (int) (Math.random() * tamañoHabitación.getLargo()));
    }

    public void mover(Tamaño tamañoHabitación) {
        double aleatorio = Math.random();
        if (aleatorio < .25 && posicion.getX() + 1 < tamañoHabitación.getAncho()) {
            posicion.setX(posicion.getX()+1);
        } else if (aleatorio < .5 && posicion.getX() > 0) {
            posicion.setX(posicion.getX()-1);
        } else if (aleatorio < .75 && posicion.getY() + 1 < tamañoHabitación.getLargo()) {
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
