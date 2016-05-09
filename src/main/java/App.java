/**
 * Created by Marga on 5/9/2016.
 */
public class App {
    private NumarLinii numarLinii;
    private ComplexitateCiclomatica complexitateCiclomatica;
    private CuplajIntreClase cuplajIntreClase;
    private DensitateDeComentarii densitateDeComentarii;
    private DependentaIntrePachete dependentaIntrePachete;
    private NivelDeMostenire nivelDeMostenire;
    private PlajaDeClase plajaDeClase;

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

    public NumarLinii getNumarLinii(){
        return this.numarLinii;
    }

    public ComplexitateCiclomatica getComplexitateCiclomatica(){
        return this.complexitateCiclomatica;
    }

    public CuplajIntreClase getCuplajIntreClase() {
        return cuplajIntreClase;
    }

    public DensitateDeComentarii getDensitateDeComentarii() {
        return densitateDeComentarii;
    }

    public DependentaIntrePachete getDependentaIntrePachete() {
        return dependentaIntrePachete;
    }

    public NivelDeMostenire getNivelDeMostenire() {
        return nivelDeMostenire;
    }

    public PlajaDeClase getPlajaDeClase() {
        return plajaDeClase;
    }
}
