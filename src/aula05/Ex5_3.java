
package aula05;

import java.util.Scanner;

public class Ex5_3
{
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        Scanner sc = new Scanner(System.in);
        
        int mec, id;
        String nome, curso, titulo, tipoEmprestimo;
        
        while(true){
            System.out.println("1 - inscrever utilizador");
            System.out.println("2 - remover utilizador");
            System.out.println("3 - imprimir lista de utilizadores");
            System.out.println("4 - registar um novo livro");
            System.out.println("5 - imprimir lista de livros");
            System.out.println("6 - emprestar");
            System.out.println("7 - devolver");
            System.out.println("8 - sair");
            
            System.out.print("Opcao: ");
            int opcao = sc.nextInt();
            
            switch(opcao){
                
                case 1:
                    System.out.print("Nome: ");
                    nome = sc.next();
                    System.out.print("Mec: ");
                    mec = sc.nextInt();
                    System.out.print("Curso: ");
                    curso = sc.next();
                    
                    biblioteca.inscreverUtilizador(nome, mec, curso);
                    break;
                    
                case 2:
                    System.out.print("Mec: ");
                    mec = sc.nextInt();
                    biblioteca.removerUtilizador(mec);
                    break;
                    
                case 3:
                    biblioteca.imprimirUtilizadores();
                    break;
                    
                case 4:
                    System.out.print("Titulo: ");
                    titulo = sc.next();
                    System.out.print("Tipo Emprestimo: ");
                    tipoEmprestimo = sc.next();
                    
                    biblioteca.registarLivro(titulo, tipoEmprestimo);
                    break;
                    
                case 5:
                    biblioteca.imprimirLivros();
                    break;
                    
                    
                case 6:
                    System.out.print("ID livro: ");
                    id = sc.nextInt();
                    System.out.print("Mec: ");
                    mec = sc.nextInt();
                    
                    boolean ok = biblioteca.emprestarLivro(mec, id);
                    if(!ok)
                        System.out.println("ERRO!!!");
                    
                    break;
                    
                case 7:
                    System.out.print("ID livro: ");
                    id = sc.nextInt();
                    System.out.print("Mec: ");
                    mec = sc.nextInt();
                    
                    biblioteca.devolverLivro(mec, id);
                    break;
                    
                case 8:
                    System.exit(0);
            }
        }
    }
}
