package aula08.Ex1;

import java.util.ArrayList;

public class Empresa {
	private String nome, email, CPostal;
	ArrayList<Veiculo> viaturas = new ArrayList<Veiculo>();
	
	public Empresa(String nome, String email, String cPostal) {
		super();
		this.nome = nome;
		this.email = email;
		CPostal = cPostal;
	}
	
	public void add(Veiculo obj) {
		viaturas.add(obj);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPostal() {
		return CPostal;
	}

	public void setCPostal(String cPostal) {
		CPostal = cPostal;
	}

	public ArrayList<Veiculo> getViaturas() {
		return viaturas;
	}

	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", email=" + email + ", CPostal=" + CPostal + ", viaturas=" + viaturas + "]";
	}

	
	
	
	
	
	

}
