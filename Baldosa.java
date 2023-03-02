public class Baldosa {
    private int estado;

    private Basura basura = new Basura();

    public Baldosa() {
        estado = inicializaEstado();
    }

    private int inicializaEstado() {
        double probabilidadMugre = Math.random();

        for (int i = Basura.MUY_SUCIO; i >= Basura.LIMPIO; i--) {
            if (probabilidadMugre >= Basura.PROBABILIDADES[i]) {
                return i;
            }
        }
        return Basura.LIMPIO;
    }

    public int ver() {
        return estado;
    }

    public void ensucia() {
        if (estado <= Basura.MUY_SUCIO) {
            estado++;
        }
    }
}
