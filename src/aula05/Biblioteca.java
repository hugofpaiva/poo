package aula05;
import java.util.Vector;

public class Biblioteca {
    
    Vector livros  =  new Vector(100);
    Vector utilizadores  =  new Vector(100);
    
    public void inscreverUtilizador (String nome, int nMec, String curso){
        Utilizador u =  new Utilizador(nome, nMec, curso);
        utilizadores.add(u);
    }
    
    public void removerUtilizador(int mec){
        for (int i = 0; i<utilizadores.size(); i++)
            if( ((Utilizador)utilizadores.get(i)).getnMec() == mec )
                utilizadores.remove(i);
    }
    
    public void imprimirUtilizadores(){
        for (int i = 0; i<utilizadores.size(); i++)
            System.out.println(utilizadores.get(i));
    }
    
    
    public void registarLivro(String titulo, String tipoEmprestimo){
        Livro l =  new Livro(titulo, tipoEmprestimo);
        livros.add(l);
    }
    
    
    public void imprimirLivros(){
        for (int i = 0; i<livros.size(); i++)
            System.out.println(livros.get(i));
    }
    
    
    public boolean emprestarLivro(int mec, int id){
        
        Utilizador u = null;
        for(int i=0; i<utilizadores.size(); i++){
            if (mec == ((Utilizador) utilizadores.get(i)).getnMec()){
                u = ((Utilizador) utilizadores.get(i));
                break;
            }
        }
        
        Livro l = null;
        for(int i=0; i<livros.size(); i++){
            if (id == ((Livro) livros.get(i)).getId()){
                l = ((Livro) livros.get(i));
                break;
            }
        }
        
        if (l.getTipoEmprestimo() == "CONDICIONAL")
            return false;
               
        boolean emprestado = u.adicionarAEmprestados(id);
        
        if(emprestado)
            l.setEmprestado(true);
        
        return emprestado;
    }
    
    public boolean devolverLivro(int mec, int id){
        
        Utilizador u = null;
        for(int i=0; i<utilizadores.size(); i++){
            if (mec == ((Utilizador) utilizadores.get(i)).getnMec()){
                u = ((Utilizador) utilizadores.get(i));
                break;
            }
        }
        
        Livro l = null;
        for(int i=0; i<livros.size(); i++){
            if (id == ((Livro) livros.get(i)).getId()){
                l = ((Livro) livros.get(i));
                break;
            }
        }
        
        if (l.isEmprestado() == true)
        {
            u.removerEmprestados(id);
            return true;
        }
        
        return false;
    }
    
    
    
}
