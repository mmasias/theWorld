public class Gato extends Movimiento{
    public Gato(Habitacion habitacion) {
        super(habitacion);
    }

    public void mover(Habitacion habitacion) {
        super.mover(habitacion);
    }

    public void ensuciar(Habitacion habitacion) {
        if (Math.random() > .75) {
            habitacion.ensuciar(super.posicionX, super.posicionY);
        }
    }
}
