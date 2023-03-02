public class Baldosa {
    private int estado;

    public Baldosa(){
        estado = definirEstadoInicial();
    }

    private int definirEstadoInicial() {
        double probabilidad = Math.random();

        if(probabilidad <= 0.5) return 0;
        else if (probabilidad <= 0.7) return 1;
        else if (probabilidad <= 0.85) return 2;
        else if (probabilidad <= 0.95) return 3;
        else return 4;
    }

    public void ensuciarBaldosa() {
        if (estado <= 3) estado++;
    }
    public int estadoDeSuciedad() {
        return estado;
    }
}