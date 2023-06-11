public class Gato {

    public int posicionX, posicionY;
    private static final double PROBABILIDAD_DE_ENSUCIAR = .5;

    public Gato(Habitacion habitacion) {
        posicionX = (int) (Math.random() * habitacion.getAncho());
        posicionY = (int) (Math.random() * habitacion.getLargo());
    }

    public void mover(Habitacion habitacion) {
        double aleatorio = Math.random();
        if (aleatorio < 0.25 && posicionX + 1 < habitacion.getAncho()) {
            this.mover("DERECHA");
        } else if (aleatorio < 0.5 && posicionX > 0) {
            this.mover("IZQUIERDA");
        } else if (aleatorio < 0.75 && posicionY + 1 < habitacion.getLargo()) {
            this.mover("ABAJO");
        } else if (aleatorio < 1 && posicionY > 0) {
            this.mover("ARRIBA");
        }
    }

    private void mover(String direccion){
        switch(direccion){
            case "ARRIBA":
                posicionY--;
                break;
            case "ABAJO":
                posicionY++;
                break;
            case "IZQUIERDA":
                posicionX--;
                break;
            case "DERECHA":
                posicionX++;
                break;
        }
    }

    public void ensuciar(Habitacion habitacion) {
        if (Math.random() > PROBABILIDAD_DE_ENSUCIAR) {
            habitacion.ensuciar(this.posicionX, this.posicionY);
        }
    }
}