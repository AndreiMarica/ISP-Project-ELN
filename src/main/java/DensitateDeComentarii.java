/**
 * Clasa DensitateDeComentarii.
 */
public class DensitateDeComentarii {
    //campul densitate de comentarii
    private float densitateComentarii;

    //getter densitate de comentarii
    public float getDensitateComentarii() {
        return densitateComentarii;
    }

    //setter densitate de comentarii
    public void setDensitateComentarii(float densitateComentarii) {
        this.densitateComentarii = densitateComentarii;
    }

    //metoda de afisare densitate de comentarii
    public void afisareDC(){
        System.out.println("Densitate comentarii: "+this.densitateComentarii);
    }
}
