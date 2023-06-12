package ejemploLiskov;
public class Hijo  extends Persona{
 
    private Padre papa;
     
    public Hijo(String name, String last,Padre papa) {
        super( name, last);
        this.papa=papa;
    }
 
    public Padre getPadre() {
        return papa;
    }
 
    public void setPadre(Padre papa) {
        this.papa = papa;
    }
    
}