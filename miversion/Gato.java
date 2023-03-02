package miversion;

public final class Gato {
    public Posicion posicion;

    public Gato(int x, int y) {
        this.posicion = new Posicion(x, y);
    }

    public boolean vaAEnsuciar() {
        return Math.random() < 0.75;
    }

    public void aplicarDireccion(Direccion nuevaDireccion) {
        this.posicion = this.posicion.nuevaPosicionAPartirDe(nuevaDireccion);
    }
}
