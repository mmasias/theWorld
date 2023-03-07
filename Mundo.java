import java.util.Scanner;

class Mundo {

    private Habitacion habitacion;
    private Gato[] gatosMundo;

    public Mundo(int cantidadGatos) {
        habitacion = new Habitacion(20,15);
        gatosMundo = crearGatos(cantidadGatos);
    }

    private Gato[] crearGatos(int cantidadGatos) {

        gatosMundo = new Gato[cantidadGatos];

        for (int i = 0; i<gatosMundo.length; i++){
            gatosMundo[i] = new Gato(habitacion.tamaño);
        }

        return gatosMundo;
    }

    void empezar() {
        do {
            pasarCiclo();
        } while (quiereSeguir());
    }

    private void pasarCiclo() {
        accionGato();
        imprimirGatos();
    }

    private void accionGato() {
        for (Gato gato : gatosMundo){
            gato.mover(habitacion.tamaño);
            gato.ensuciar(habitacion);
        }
    }

    private void imprimirGatos() {
       habitacion.imprimir(gatosMundo);
    }

    boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    public static void main(String[] args) {

        new Mundo(4).empezar();
    }
}
