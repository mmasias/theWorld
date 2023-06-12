package Vista;

import Modelo.*;

import java.util.Scanner;

public class RenderizadorMundo {

    private Tamaño tamañoHabitacion;

    public RenderizadorMundo(Tamaño tamaño) {
        this.tamañoHabitacion = tamaño;
    }

    public void imprimir(Gato[] gatos, Baldosa baldosas[][]) {

        char vistaBaldosa;
        borraPantalla();
        imprimeLinea();
        for (int i = 0; i < tamañoHabitacion.getLargo() ; i++) {
            for (int j = 0; j < tamañoHabitacion.getAncho() ; j++) {
                if (gatoEnBaldosa(i, j, gatos)) {
                    System.out.print(">G<");
                } else {
                    vistaBaldosa = " .oO#".charAt(baldosas[i][j].ver());
                    System.out.print(" " + vistaBaldosa + " ");
                }
            }
            System.out.println();
        }
        imprimeLinea();
    }

    private boolean gatoEnBaldosa(int i, int j, Gato[] gatos) {

        for(Gato gato: gatos){
            if (gato.posicion.getX() == j && gato.posicion.getY() == i) return true;
        }
        return false;
    }

    private void imprimeLinea() {
        for (int j = 0; j < tamañoHabitacion.getAncho(); j++) {
            System.out.print("===");
        }
        System.out.println();
    }

    private void borraPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }
}
