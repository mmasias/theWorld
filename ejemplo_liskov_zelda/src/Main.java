public class Main {
    public static void main(String[] args) {

        Material material = new Material("diamante", 25);

        EspadaMaestra espadaMaestra = new EspadaMaestra();
        Mandoble mandoble = new Mandoble();
        Personaje link = new Personaje();
        link.recogerArma(espadaMaestra);
        link.recogerArma(mandoble);
        link.seleccionarArma(1);
        link.mostrarArmas();

        System.out.println(link.getArmaActual());

    }
}