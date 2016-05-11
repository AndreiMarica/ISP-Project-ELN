/**
 * Clasa NivelDeMostenire.
 */
public class NivelDeMostenire {
    //camp nivel de mostenire
    private int nivelDeMostenire;

    //getter nivel de mostenire
    public int getNivelDeMostenire() {
        return nivelDeMostenire;
    }

    //setter nivel de ostenire
    public void setNivelDeMostenire(int nivelDeMostenire) {
        this.nivelDeMostenire = nivelDeMostenire;
    }

    //metoda de afisare nivel de mostenire
    public void afisareNM(){
        System.out.println("Nivel de mostenire: "+nivelDeMostenire);
    }
}
