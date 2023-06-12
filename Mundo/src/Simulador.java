import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulador {
    private Habitacion habitacion = new Habitacion(15, 20);;

    void empezar() {
        List<Gato> listaGatos = preguntarNumGatos();
        do {
            for(int i = 0; i<listaGatos.size();i++){
                listaGatos.get(i).mover(habitacion);
                listaGatos.get(i).ensuciar(habitacion);
            }
            habitacion.imprimir(listaGatos);
        } while (quiereSeguir());
    }
    List<Gato> preguntarNumGatos(){
        System.out.println("¿Cuantos gatos quieres?");
        Scanner sc = new Scanner(System.in);
        int numGatos = sc.nextInt();
        List<Gato> gatos = new ArrayList<>(numGatos);
        for(int i = 0; i<numGatos; i++){
            Gato gato = new Gato(habitacion);
            gatos.add(gato);
        }
        return gatos;
    }

    boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }
}
