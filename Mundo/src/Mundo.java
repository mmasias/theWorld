import java.sql.SQLOutput;
import java.util.Scanner;

class Mundo {

    private Habitacion habitacion;
    Gato gatos[]=new Gato[2];
    private Gato gato;
    private Gato gato2;

    public Mundo() {
        habitacion = new Habitacion(15, 20);
        gato = new Gato(habitacion);
        gatos[0]= gato;
        gato2 = new Gato(habitacion);
        gatos[1]= gato2;
    }

    void empezar() {
        do {
            gato.mover(habitacion);
            gato.ensuciar(habitacion);
            gato2.mover(habitacion);
            gato2.ensuciar(habitacion);
            habitacion.imprimir(gatos);
        } while (quiereSeguir());
    }
    void preguntarNumGatos(){
        System.out.println("¿Cuantos gatos quieres?");
        Scanner sc = new Scanner(System.in);
        int numGatos = sc.nextInt();
        for(int i = 0; i<numGatos; i++){

        }
    }
    void crearGato(){
        Gato gato3;
    }

    boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    public static void main(String[] args) {

        new Mundo().empezar();
    }
}

