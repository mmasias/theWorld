import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private Arma _armaActual;

    private ArrayList _armas = new ArrayList();

    public void recogerArma(Arma arma){
        this.coleccionarArma(arma);
    }
    private void coleccionarArma(Arma armaARecoger){
        this._armas.add(armaARecoger);
    }
    public void seleccionarArma(int numeroArma){
        this._armaActual = (Arma) this._armas.get(numeroArma);
    }

    public String getArmaActual() {
        return "Arma seleccionada: " + this._armaActual.getNombreCompletoArma();
    }

    public int getDañoTotalADar() {
        return this._armaActual.dañoBase();
    }

    public void mostrarArmas(){
        for (int i = 0; i < this._armas.size(); i++) {
            Arma arma = (Arma) this._armas.get(i);
            System.out.println("Arma no."+i +": "+ arma.getNombreCompletoArma());
        }
    }
}
