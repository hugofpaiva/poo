package aula05;

public class Livro {
    private int id;
    private String titulo;
    private String tipoEmprestimo;
    private static int currentID = 100;
    private boolean emprestado = false;
    
    public Livro(String titulo) {
        this.titulo = titulo;
        tipoEmprestimo="NORMAL";
        id=currentID;
        currentID+=1;
    }
    
    public Livro(String titulo, String tipoEmprestimo)
    {
        this.titulo = titulo;
        this.tipoEmprestimo = tipoEmprestimo;
        id=currentID;
        currentID+=1;
    }
   
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipoEmprestimo() {
        return tipoEmprestimo;
    }
    public void setTipoEmprestimo(String tipoEmprestimo) {
        this.tipoEmprestimo = tipoEmprestimo;
    }
    public static int getCurrentID() {
        return currentID;
    }
    public static void setCurrentID(int currentID) {
        Livro.currentID = currentID;
    }
    
    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return "Livro " + id + "; " + titulo + "; " + tipoEmprestimo;
    }
    
    
    
}
