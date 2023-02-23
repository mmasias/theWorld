public class Baldosa {

    private int estado;

    public Baldosa() {
        estado = inicializaEstado();
    }

    private int inicializaEstado() {
        double probabilidadMugre = Math.random();
        if (probabilidadMugre <= 0.01) {
            return 3;
        } else if (probabilidadMugre < 0.04) {
            return 2;
        } else if (probabilidadMugre < 0.07) {
            return 1;
        }
        return 0;
    }

    public int ver() {
        return estado;
    }

    public void ensucia() {
        if (estado < 4) {
            estado++;
        }
    }
}
