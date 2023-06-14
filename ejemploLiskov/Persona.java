package ejemploLiskov;
 
public class Persona {
 
    private String name;
    private String last;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return last;
    }
    public void setLastName(String last) {
        this.last = last;
    }
    public Persona( String name, String last) {
        super();
         
        this.name = name;
        this.last = last;
         
    }
     
 
}