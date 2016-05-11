/**
 * Clasa NumarLinii.
 */
public class NumarLinii {
    //campul numar de linii
    private int numarLinii;

    //getter numar de linii
    public int getNumarLinii() {
        return numarLinii;
    }

    //setter numar de linii
    public void setNumarLinii(int numarLinii) {
        this.numarLinii = numarLinii;
    }

    //metoda de afisare
    public void afisareNrLiniiCod(){
        System.out.println("Numar linii de cod: "+numarLinii);
    }
}
