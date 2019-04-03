package aula07;

import java.util.ArrayList;

public class AgenciaViagens {
    
    private ArrayList<Alojamento> alojamentos = new ArrayList<>();
    private ArrayList<Carro> viaturas = new ArrayList<>();
    private String nome, endereco;

    public AgenciaViagens(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public void addAlojamento(Alojamento al){
        alojamentos.add(al);
    }
    
    public void addViaturas(Carro car){
        viaturas.add(car);
    }
    
    public ArrayList<Alojamento> getAlojamentos() {
        return alojamentos;
    }

    public ArrayList<Carro> getViaturas() {
        return viaturas;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setAlojamentos(ArrayList<Alojamento> alojamentos) {
        this.alojamentos = alojamentos;
    }

    public void setViaturas(ArrayList<Carro> viaturas) {
        this.viaturas = viaturas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "AgenciaViagens " + "\n alojamentos=" + alojamentos + ", viaturas=" + viaturas + ", nome=" + nome + ", endereco=" + endereco + '}';
    }
       
    
    
}
