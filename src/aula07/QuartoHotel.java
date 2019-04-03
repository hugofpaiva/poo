package aula07;

public class QuartoHotel extends Alojamento {
    
    private String tipo;
    
    public QuartoHotel(String codigo, String nome, String local, double pnoite, double avaliacao, String tipo) {
        super(codigo, nome, local, pnoite, avaliacao);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
