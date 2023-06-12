public class Baldosa {
    private int estado;
    
    public Baldosa() {
        estado = 0; // Estado inicial
    }
    
    public int ver() {
        return estado;
    }
    
    public void ensuciar() {
        estado = 1; // Cambiar el estado a sucio
    }
}