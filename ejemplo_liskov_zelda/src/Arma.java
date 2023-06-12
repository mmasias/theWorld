class Arma {
    private int _dañoBase;
    private String _nombreArma;

    public Arma(int dañoBase, String nombreArma) {
        this._dañoBase = dañoBase;
        this._nombreArma = nombreArma;
    }

    public int dañoBase() {
        return this._dañoBase;
    }

    public void fusionarElemento(Object elemento) {

        if(elemento instanceof Arma){
            this._nombreArma += " + "+ ((Arma) elemento).getNombreCompletoArma();
            this._dañoBase += ((Arma) elemento).dañoBase();
        }
        if(elemento instanceof Material){
            this._nombreArma += " + "+ ((Material) elemento).getNombreMaterial();
            this._dañoBase += ((Material) elemento).getBonusDaño();
        }

    }

    public String getNombreCompletoArma(){
        return this._nombreArma;
    }
}