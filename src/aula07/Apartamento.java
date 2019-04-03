package aula07;

public class Apartamento extends Alojamento {
    
    private int nquartos;
    
    public Apartamento(String codigo, String nome, String local, double pnoite, double avaliacao, int nquartos) {
        super(codigo, nome, local, pnoite, avaliacao);
        this.nquartos = nquartos;
    }

    public int getNquartos() {
        return nquartos;
    }

    public void setNquartos(int nquartos) {
        this.nquartos = nquartos;
    }
    
    
    
}
