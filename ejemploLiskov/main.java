package ejemploLiskov;

public class main {
    public static void main(String[] args) {
        Padre padre= new Padre("Manuel","Rondon","Y1234567M","...6427");
        Hijo hijo= new Hijo("Alejandro","Féliz",padre);
        
        System.out.println(padre.getName());
        System.out.println(hijo.getName());

        padre.pagar();
        hijo.getPadre().pagar();
        
    }
}
