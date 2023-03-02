public class Gato {


    private int _ARRIBA = 1;
    private int _ABAJO = 2;
    private int _DERECHA = 3;
    private int _IZQUIERDA = 4;

    public Gato() {
    }

    public int dondeQuieresMoverte() {
        double aleatorio = Math.random();
        if (aleatorio < .25) {
            return _DERECHA;
        } else if (aleatorio < .5) {
            return _IZQUIERDA;
        } else if (aleatorio < .75) {
            return _ARRIBA;
        } else {
            return _ABAJO;
        }
    }

    public boolean VasAEnsuciar() {
        return Math.random() > .75;
    }
}