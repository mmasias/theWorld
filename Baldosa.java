public class Baldosa {
   
   private int baldosa;

    public Baldosa() {
        this.baldosa = inicializaEstado();
    }

    private int inicializaEstado(){
        double probabilidadMugre = Math.random();
        int estado;
        if (probabilidadMugre<=0.01)      { estado = 3;} 
        else if (probabilidadMugre<0.04)  { estado = 2;} 
        else if (probabilidadMugre<0.07)  { estado = 1;} 
        else                              { estado = 0;}
        return estado;
    }

    public int ver(){
        return this.baldosa;
    }

    public void ensucia(){
        if(this.baldosa<4){
            this.baldosa++;
        };
    }
}
