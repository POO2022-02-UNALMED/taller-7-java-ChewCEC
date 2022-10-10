package comunicacion;

public class Alfabeto extends Pictograma{
    private String letras[];
    
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }
    
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    public String toString() {
        String r = letras[0];
        for (int i = 1; i < this.letras.length; i++) {
            r += this.letras[i] + ", ";
        }
        return r;
    }
    
    public int cantidadLetras() {
        return this.letras.length;
    }

    //Setters y Getters
    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    
}
