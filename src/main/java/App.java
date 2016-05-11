/**
 * Clasa App.
 */
public class App {
    //camp numar de linii
    private NumarLinii numarLinii;
    //camp complexitate ciclomatica
    private ComplexitateCiclomatica complexitateCiclomatica;
    //camp culaj intre clase
    private CuplajIntreClase cuplajIntreClase;
    //camp densitate de comentarii
    private DensitateDeComentarii densitateDeComentarii;
    //camp dependenta intre pachete
    private DependentaIntrePachete dependentaIntrePachete;
    //camp nivel de mostenire
    private NivelDeMostenire nivelDeMostenire;
    //camp plaja de clase
    private PlajaDeClase plajaDeClase;

    /**
     * Constructorul default al clasei App
     */
    public App(){
        this.numarLinii= new NumarLinii();
        this.complexitateCiclomatica= new ComplexitateCiclomatica();
        this.cuplajIntreClase = new CuplajIntreClase();
        this.densitateDeComentarii = new DensitateDeComentarii();
        this.dependentaIntrePachete = new DependentaIntrePachete();
        this.nivelDeMostenire = new NivelDeMostenire();
        this.plajaDeClase = new PlajaDeClase();
    }

    /**
     * Constructorul cu parametrii aferent clasei App
     *
     * @param numarLinii
     * @param complexitateCiclomatica
     * @param cuplajIntreClase
     * @param densitateDeComentarii
     * @param dependentaIntrePachete
     * @param nivelDeMostenire
     * @param plajaDeClase
     */
    public App(NumarLinii numarLinii, ComplexitateCiclomatica complexitateCiclomatica, CuplajIntreClase cuplajIntreClase, DensitateDeComentarii densitateDeComentarii, DependentaIntrePachete dependentaIntrePachete, NivelDeMostenire nivelDeMostenire, PlajaDeClase plajaDeClase) {
        this.numarLinii = numarLinii;
        this.complexitateCiclomatica = complexitateCiclomatica;
        this.cuplajIntreClase = cuplajIntreClase;
        this.densitateDeComentarii = densitateDeComentarii;
        this.dependentaIntrePachete = dependentaIntrePachete;
        this.nivelDeMostenire = nivelDeMostenire;
        this.plajaDeClase = plajaDeClase;
    }

    public void metrica(String solicitare){
        //todo implementare
    }

    public void suspendare(){
        //todo implementare
    }

    public void resume(){
        //todo implementare
    }

    /**
     * returneaza obiectul ce reprezinta numarul de linii de cod
     * @return
     */
    public NumarLinii getNumarLinii(){
        return this.numarLinii;
    }


    /**
     * returneaza obiectul ce reprezinta complexitatea ciclomatica
     * @return
     */
    public ComplexitateCiclomatica getComplexitateCiclomatica(){
        return this.complexitateCiclomatica;
    }


    /**
     * returneaza obiectul ce reprezinta cuplajul intre clase
     * @return
     */
    public CuplajIntreClase getCuplajIntreClase() {
        return cuplajIntreClase;
    }


    /**
     * returneaza obiectul ce reprezinta densitatea de comentarii
     * @return
     */
    public DensitateDeComentarii getDensitateDeComentarii() {
        return densitateDeComentarii;
    }


    /**
     * returneaza obiectul ce reprezinta dependenta intre pachete
     * @return
     */
    public DependentaIntrePachete getDependentaIntrePachete() {
        return dependentaIntrePachete;
    }


    /**
     * returneaza obiectul ce reprezinta nivelul de mostenire
     * @return
     */
    public NivelDeMostenire getNivelDeMostenire() {
        return nivelDeMostenire;
    }


    /**
     * returneaza obiectul ce reprezinta plaja de clase
     * @return
     */
    public PlajaDeClase getPlajaDeClase() {
        return plajaDeClase;
    }
}
