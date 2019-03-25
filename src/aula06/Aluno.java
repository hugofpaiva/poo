package aula06;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	// Isto apenas é criado na primeira execução do aluno
	// O Static faz com que seja acessível sempre que chamo a classe Aluno
	private int NMEC;
	private static int currentNMEC = 100;
	private Data DataInsc;
	
	

	public Aluno(String nome, int cc, Data dataNasc) {
		super(nome, cc, dataNasc);
		NMEC = currentNMEC;
		currentNMEC+=1;
		DataInsc = new Data (LocalDate.now().getDayOfMonth(), LocalDate.now().getMonthValue(), LocalDate.now().getYear());
				
		
	}
	public Aluno(String nome, int cc, Data dataNasc, Data DataInsc) {
		super(nome, cc, dataNasc);
		NMEC = currentNMEC;
		currentNMEC+=1;
		this.DataInsc = DataInsc;
	}
	public int getNMEC() {
		return NMEC;
	}
	public void setNMEC(int nMEC) {
		NMEC = nMEC;
	}
	public int getCurrentNMEC() {
		return currentNMEC;
	}
	public Data getDataInsc() {
		return DataInsc;
	}
	public void setDataInsc(Data dataInsc) {
		DataInsc = dataInsc;
	}
	@Override
	public String toString() {
		return super.getNome() + ", NMEC: " + NMEC +  ", DataInsc: " + DataInsc;
	}
	
	
	

}
