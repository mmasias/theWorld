import java.util.Scanner;
class Mundo{

    private Scanner entrada = new Scanner(System.in);
    private Habitacion habitacion;
    private Gato gato;

    public Mundo(){
        habitacion = new Habitacion(10,10);
        gato = new Gato(habitacion);
    }

    public void empezar(){
        do {
            this.gato.mover(this.habitacion);
            this.gato.ensuciar(this.habitacion);
            this.habitacion.imprimir(this.gato);
        } while (!entrada.nextLine().equalsIgnoreCase("f")); 
    }

    public static void main(String[] args){
        new Mundo().empezar();
    }

}