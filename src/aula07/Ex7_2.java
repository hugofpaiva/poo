package aula07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex7_2 {
    
    static Scanner sc;
    static AgenciaViagens ag1;
    
    public static void main(String[] args){
        ag1 = new AgenciaViagens("Viajar sem Limites", "Rua Sem Nome, Nº0");
        Apartamento apt1 = new Apartamento("A1241", "Apartamentos Maritimos", "Vilamoura", 94.5, 4.3, 1);
        Apartamento apt2 = new Apartamento("A1342", "Vila Solar", "Albufeira", 105.3, 4.1, 2);
        QuartoHotel qht1 = new QuartoHotel("H432", "Hotel Villa Galé", "Galé", 270.0, 4.9, "double");
        Carro c1 = new Carro("C92",'A', "diesel");
        
        ag1.addAlojamento(apt1); ag1.addAlojamento(apt2); ag1.addAlojamento(qht1);
        ag1.addViaturas(c1);
        
        sc = new Scanner(System.in);
        menu();
        sc.close();
    }

    private static void menu() {
        int choice = 0;
        do{
            System.out.println("[1] Listar Alojamentos Disponíveis");
            System.out.println("[2] Listar Viaturas Disponíveis");
            System.out.println("[3] Criar Alojamento");
            System.out.println("[4] Criar Viatura");
            System.out.println("[5] Check-in Alojamento");
            System.out.println("[6] Check-out Alojamentos");
            System.out.println("[7] Levantar Viatura");
            System.out.println("[8] Entregar Viatura");
            System.out.println("[9] Sair");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    listarAlojamentos();
                    break;
                case 2:
                    listarViaturas();
                    break;
                case 3:
                    criarAlojamento();
                    break;
                case 4:
                    criarViatura();
                    break;
                case 5:
                    checkinAlojamento();
                    break;
                case 6:
                    checkoutAlojamento();
                    break;
                case 7:
                    levantarViatura();
                    break;
                case 8:
                    entregarViatura();
                    break;
                case 9:
                    System.exit(0);
            }
        }while(choice != 9);
        
        
    }

    private static void listarAlojamentos() {
        ArrayList<Alojamento> lista = ag1.getAlojamentos();
        for(Alojamento al : lista){
            if(al.isDisponibilidade())
                System.out.println(al);
        }
    }

    private static void listarViaturas() {
        ArrayList<Carro> lista = ag1.getViaturas();
        for(Carro car : lista){
            if(car.isDisponivel())
                System.out.println(car);
        }    
    }

    private static void criarAlojamento() {
   
    }

    private static void criarViatura() {
        System.out.println("Código: ");
        String codigo = sc.next();
        System.out.println("Classe: ");
        String classe = sc.next();
        System.out.println("Combustivel: ");
        String combustivel = sc.next();
        Carro c = new Carro(codigo, classe.charAt(0), combustivel);
        ag1.addViaturas(c);
    }
    
    private static void checkinAlojamento() {
        System.out.println("Código Alojamento: ");
        String code = sc.nextLine();
        ArrayList<Alojamento> lista = ag1.getAlojamentos();
        for(Alojamento al : lista){
            if(al.isDisponibilidade() && al.getCodigo().equals(code)){
                al.checkin();
            }
        }
    }
    
    private static void checkoutAlojamento() {
        System.out.println("Código Alojamento: ");
        String code = sc.nextLine();
        ArrayList<Alojamento> lista = ag1.getAlojamentos();
        for(Alojamento al : lista){
            if(al.isDisponibilidade() && al.getCodigo().equals(code)){
                al.checkout();
            }
        }    
    }
    
    private static void levantarViatura(){
        System.out.println("Código Viatura: ");
        String code = sc.nextLine();
        ArrayList<Carro> lista = ag1.getViaturas();
        for(Carro c : lista){
            if(c.isDisponivel() && c.getCodigo().equals(code)){
                c.levantar();
            }
        }
    }
    
    private static void entregarViatura(){
      System.out.println("Código Viatura: ");
        String code = sc.nextLine();
        ArrayList<Carro> lista = ag1.getViaturas();
        for(Carro c : lista){
            if(c.isDisponivel() && c.getCodigo().equals(code)){
                c.entregar();
            }
        }  
    }
    
}
