package aula07;

public class Carro {
    
    private String codigo;
    private char classe;
    private String combustivel;
    private boolean disponivel;

    public Carro(String codigo, char classe, String combustivel) {
        this.codigo = codigo;
        if(verificarClasse(classe))
            this.classe = classe;
        this.combustivel = combustivel;
        this.disponivel = true; 
    }
    
    public boolean verificarClasse(char classe){
        if(classe >= 'A' && classe <='F')
            return true;
        return false;
    }
    
    public void levantar(){
        if(this.disponivel)
            this.disponivel = false;
    }
    
    public void entregar(){
        if(!this.disponivel)
            this.disponivel = true;
        
    }

    public char getClasse() {
        return classe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    

    @Override
    public String toString() {
        return "Carro " + codigo + "\n classe: " + classe + "\n combustivel: " + combustivel;
    }
    
    
}
