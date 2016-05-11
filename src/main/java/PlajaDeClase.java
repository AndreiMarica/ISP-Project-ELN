/**
 * Clasa PlajaDeClase.
 */
public class PlajaDeClase {
    //camp plaja de clase
    private int plajaDeClase;

    //getter plaja de clase
    public int getPlajaDeClase() {
        return plajaDeClase;
    }

    //setter plaja de clase
    public void setPlajaDeClase(int plajaDeClase) {
        this.plajaDeClase = plajaDeClase;
    }

    //metoda de afisare plaja de clase
    public void afisarePC(){
        System.out.println("Plaja de clase: "+this.plajaDeClase);
    }
}
