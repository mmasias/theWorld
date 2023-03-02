import java.util.Scanner;

class Mundo {
    Habitacion habitacion;

    public Mundo() {
        habitacion = new Habitacion(15, 20, 3);
    }

    private void iniciarMundo() {
        do {
            habitacion.pasarTiempo();
        } while(continuar());
    } 
    
    private boolean continuar(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }


    public static void main(String[] args) {
        new Mundo().iniciarMundo();
    }


}