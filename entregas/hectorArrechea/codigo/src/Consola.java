import java.util.Scanner;

public class Consola {

    private Consola() {
    }

    public static void imprimir(String mensaje) {
        System.out.print(mensaje);
    }

    public static void imprimeLinea(int ancho) {
        for (int j = 0; j < ancho; j++) {
            System.out.print("===");
        }
        System.out.println();
    }

    public static void limpiaConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        imprimir("Presione F para salir, cualquier otra tecla para continuar: ");
        return !entrada.nextLine().equalsIgnoreCase("f");
    }
}
