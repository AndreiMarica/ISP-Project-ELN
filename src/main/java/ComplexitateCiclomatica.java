/**
 * Clasa ComplexitateCiclomatica.
 */
public class ComplexitateCiclomatica {
    //camp complexitate ciclomatica
    private int complexitateCiclomatica;

    //getter complexitate ciclomatica
    public int getComplexitateCiclomatica() {
        return complexitateCiclomatica;
    }

    //setter complexitate ciclomatica
    public void setComplexitateCiclomatica(int complexitateCiclomatica) {
        this.complexitateCiclomatica = complexitateCiclomatica;
    }

    //metoda afisare complexitate ciclomatica
    public void afisareCC(){
        System.out.println("Complexitate ciclomatica: "+this.complexitateCiclomatica);
    }
}
