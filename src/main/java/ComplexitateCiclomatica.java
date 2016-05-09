/**
 * Created by Marga on 5/9/2016.
 */
public class ComplexitateCiclomatica {
    private int complexitateCiclomatica;

    public int getComplexitateCiclomatica() {
        return complexitateCiclomatica;
    }

    public void setComplexitateCiclomatica(int complexitateCiclomatica) {
        this.complexitateCiclomatica = complexitateCiclomatica;
    }

    public void afisareCC(){
        System.out.println("Complexitate ciclomatica: "+this.complexitateCiclomatica);
    }
}
