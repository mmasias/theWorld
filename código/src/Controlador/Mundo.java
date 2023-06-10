package Controlador;

import Modelo.*;
import Vista.RenderizadorMundo;

public class Mundo {

    private Habitacion habitacion;
    private Gato[] gatosMundo;
    private RenderizadorMundo renderizadorMundo;

    public Mundo(int cantidadGatos, Tamaño tamaño) {
        habitacion = new Habitacion(tamaño);
        gatosMundo = crearGatos(cantidadGatos);
        renderizadorMundo = new RenderizadorMundo(tamaño);
    }

    private Gato[] crearGatos(int cantidadGatos) {

        gatosMundo = new Gato[cantidadGatos];

        for (int i = 0; i<gatosMundo.length; i++){
            gatosMundo[i] = new Gato(habitacion.tamaño);
        }

        return gatosMundo;
    }

    public void empezar() {
        do {
            pasarCiclo();
        } while (renderizadorMundo.quiereSeguir());
    }

    private void pasarCiclo() {
        accionGatos();
        renderizadorMundo.imprimir(gatosMundo, habitacion.getBaldosas());
    }

    private void accionGatos() {
        for (Gato gato : gatosMundo){
            gato.mover();
            gato.ensuciar(habitacion);
        }
    }

}
