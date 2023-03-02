package miversion;

import java.util.Scanner;

public final class Mundo {
    private final RederizadorHabitacion rederizadorHabitacion;
    private final Habitacion habitacion;

    public Mundo(int numeroDeGatos, int tamano, double[] probabilidadesSuciedad) {
        this.habitacion = new Habitacion(numeroDeGatos, tamano, probabilidadesSuciedad);
        this.rederizadorHabitacion = new RederizadorHabitacion();
    }

    public void empezar() {
        do {
            habitacion.moverGatos();
            habitacion.ensuciar();
            rederizadorHabitacion.renderizar(habitacion);
        }while (quiereSeguir());
    }

    private boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    public static void main(String[] args) {
        Mundo mundo = new Mundo(3, 20, new double[]{0.1, 0.2, 0.7, 0.9});
        mundo.empezar();
    }
}
