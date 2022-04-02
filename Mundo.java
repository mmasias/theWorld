import java.util.Scanner;
class Mundo{

    Scanner entrada = new Scanner(System.in);
    Habitacion habitacion;
    Gato gato;

    public Mundo(){
        habitacion = new Habitacion(10,10);
        gato = new Gato(habitacion);
    }

    public void empezar(){
        do {
            gato.mover(this.habitacion);
            gato.ensuciar(this.habitacion);
            this.habitacion.imprimir(gato);
        } while (!entrada.nextLine().equalsIgnoreCase("f")); 
    }

    public static void main(String[] args){
        new Mundo().empezar();
    }

}