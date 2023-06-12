package ejemploLiskov;
 
public class Padre extends Persona {
 
     
    public Padre(String name, String last, String id, String card) {
        super(name, last);
        this.id = id;
        this.card = card;
    }
 
    private String id;
    private String card;
 
     
    public String getID() {
        return id;
    }
 
    public void setID(String id) {
        this.id = id;
    }
 
    public String getCard() {
        return card;
    }
 
    public void setCard(String card) {
        this.card = card;
    }
 
    public void pagar() {
 
        System.out.println("ID: " + id + "Card ending in:" + card);
    }
}