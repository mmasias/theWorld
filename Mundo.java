import java.util.Scanner;

public class Mundo {
    private Habitacion habitacion;
    private  Gato[] arrayGatos;


    public Mundo(int numeroDeGatos) {
        habitacion = new Habitacion(15, 20);
        arrayGatos = new Gato[numeroDeGatos];
        for(int i= 0;i<numeroDeGatos;i++){
           arrayGatos[i]= new Gato(habitacion);
        }

    }

    void empezar() {
        do {
            for(int i= 0;i<arrayGatos.length;i++){
                arrayGatos[i].mover(habitacion);
                arrayGatos[i].ensuciar(habitacion);
            }
            habitacion.imprimir(arrayGatos);
        } while (quiereSeguir());
    }

    boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    public static void main(String[] args) {
        System.out.println("Cuantos gatos quieres?");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        new Mundo(numero).empezar();
    }
}
