public class Gato {
    public int posicionX;
    public int posicionY;

    public Gato(int posicionX, int posicionY){
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    public void moverse(char direccion){
        switch (direccion) {
            case 'U':
                this.posicionY -= 1;
                break;
            case 'D':
                this.posicionY += 1;
                break;
            case 'R':
                this.posicionX += 1;
                break;
            case 'L':
                this.posicionX -= 1;
                break;
        }
    }

    public void ensuciar(Habitacion habitacion){
        if(Math.random() <= 0.25) habitacion.ensuciarBaldosa(posicionX, posicionY);
    }
}