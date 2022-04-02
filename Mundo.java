class Mundo{

    Baldosa[][] baldosas;
    int largo, ancho;

    public Mundo(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
        baldosas=new Baldosa[largo][ancho];
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                this.baldosas[i][j] = new Baldosa();
            }
        }
    }

    public void empezar(){
        this.imprimir();
    }

    private void imprimir() {
        for (int i=0;i<this.largo;i++){
            for (int j=0;j<this.ancho;j++) {
                System.out.print(this.baldosas[i][j].ver()); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        new Mundo(10,20).empezar();
    }

}