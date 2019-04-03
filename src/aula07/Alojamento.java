package aula07;

public abstract class Alojamento {
    
    private String codigo, nome, local;
    private double pnoite;
    private boolean disponibilidade;
    private double avaliacao;

    public Alojamento(String codigo, String nome, String local, double pnoite, double avaliacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.pnoite = pnoite;
        this.disponibilidade = true;
        if(verificarAvaliacao(avaliacao))
            this.avaliacao = avaliacao;
    }
    
    private boolean verificarAvaliacao(double avaliacao) {
        if (avaliacao >= 1.0 && avaliacao <= 5.0) 
            return true;
        return false;
    }
        
    public void checkin(){
        if(this.disponibilidade)
            this.disponibilidade = false;
    }
    
    public void checkout(){
        if(!this.disponibilidade)
            this.disponibilidade = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public double getPnoite() {
        return pnoite;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setPnoite(double pnoite) {
        this.pnoite = pnoite;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Alojamento " + codigo + "\n " + nome + "\n localidade: " + local + "\n pnoite: " + pnoite + " €\n disponibilidade: " + disponibilidade + "\n avaliacao: " + avaliacao + '\n';
    }
   
}
