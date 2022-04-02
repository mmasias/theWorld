public class Baldosa {
    public char baldosa;
    public Baldosa() {
        this.baldosa = inicializaEstado();
    }

    private char inicializaEstado(){
        double probabilidadMugre = Math.random();
        if (probabilidadMugre<=0.01) {
            return '#';
        } else if (probabilidadMugre<0.04) {
            return '*';
        } else if (probabilidadMugre<0.07) {
            return '·';
        } else {
            return ' ';
        }        
    }

    public char ver(){
        return this.baldosa;
    }

}
