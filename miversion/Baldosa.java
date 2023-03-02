package miversion;

public final class Baldosa {
    private final Suciedad suciedad;

    public Baldosa(int valorInicial) {
        this.suciedad = new Suciedad(valorInicial);
    }

    public void ensucuar() {
        this.suciedad.ensuciar();
    }

    public Suciedad getSuciedad() {
        return this.suciedad;
    }
}
