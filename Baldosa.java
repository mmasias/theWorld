public class Baldosa {

    private int estado;

    private static final int LIMPIO = 0;
    private static final int MUY_SUCIO = 3;
    private static final double[] PROBABILIDADES = {0.1, 0.2, 0.7, 0.9};

    public Baldosa() {
        estado = inicializaEstado();
    }

    private int inicializaEstado() {
        double probabilidadMugre = Math.random();

        for (int i = MUY_SUCIO; i >= LIMPIO; i--) {
            if (probabilidadMugre >= PROBABILIDADES[i]) {
                return i;
            }
        }
        return LIMPIO;
    }

    public int ver() {
        return estado;
    }

    public void ensuciar() {
        if (estado <= MUY_SUCIO) {
            estado++;
        }
    }
}