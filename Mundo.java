
public class Mundo {
    private Habitacion habitacion;
    private Gato[] gatos;
    
    public Mundo() {
        habitacion = new Habitacion(10, 10); // Tamaño predeterminado de la habitación
        gatos = new Gato[2]; // Crear un arreglo de dos gatos
        
        // Crear instancias de gatos y asignar coordenadas iniciales
        gatos[0] = new Gato(0, 0);
        gatos[1] = new Gato(5, 5);
    }
    
    public void empezar() {
        habitacion.imprimir();
        
        for (Gato gato : gatos) {
            gato.mover(Direccion.DERECHA); // Ejemplo de movimiento hacia la derecha
            gato.ensuciar(habitacion);
        }
        
        habitacion.imprimir();
    }
}