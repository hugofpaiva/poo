package Aula12_C;

import java.util.ArrayList;


public class Teste {
	private String disciplina, professor, data, salas;

	public Teste(String disciplina, String professor, String data, String salas) {
		this.disciplina = disciplina;
		this.professor = professor;
		this.data = data;
		this.salas = salas;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getSalas() {
		return salas;
	}

	public void setSalas(String salas) {
		this.salas = salas;
	}
	
	public String Printer() {
		return String.format("%-25s%-30s%-20s%-15s\n", this.getDisciplina(),this.getProfessor(),this.getData(),this.getSalas());
	}
	
	
	
	
	
	
	
	

	

}
