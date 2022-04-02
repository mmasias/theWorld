public class Baldosa {
    String baldosa;
    public Baldosa() {
        this.baldosa = inicializaEstado();
    }

    private String inicializaEstado(){
        double probabilidadMugre = Math.random();
        if (probabilidadMugre<0.15) {
            return "[#]";
        } else if (probabilidadMugre<0.25) {
            return "[*]";
        } else {
            return "[ ]";
        }        
    }

    public String ver(){
        return this.baldosa;
    }

}
