package aula08.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Conjunto<E> {
	
	private List<E> colecao = new ArrayList<>();
	
	// adicionar elementos
	public boolean addElement(E elemento) {
		if(!this.containsElement(elemento)) {
			colecao.add(elemento);
			return true;
		} else {
			return false;
		}
	}
	
	
	// remover elementos
	public boolean removeElement(E elemento) {
		if(this.containsElement(elemento)) {
			colecao.remove(elemento);
			return true;
		} else {
			return false;
		}
	}
	
	// remove todos os elementos
	public boolean removeAll() {
		return colecao.removeAll(colecao);
	}
	
	// verificar se o elemento está na lista
	public boolean containsElement(E elemento) {
		if(colecao.contains(elemento)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeElement(int index) {
		if(this.containsElement(colecao.get(index))) {
			colecao.remove(colecao.remove(index));
			return true;
		} else {
			return false;
		}
	}
	
	// tamanho do conjunto
	public int size() {
		return colecao.size();
	}
	
	// verifica se o conjunto está vazio
	public boolean isEmpty() {
		return colecao.isEmpty();
	}
	

	
	// retorna array de elementos
	@SuppressWarnings("unchecked")
	public E[] giveElements() {
		E[] elementos = (E[]) new Object[colecao.size()];
		
		for(int i = 0; i < colecao.size(); i++) {
			elementos[i] = colecao.get(i);
		}
		
		return elementos;
	}

	
	
	@Override
	public String toString() {
		
		String text = "";
		
		for(E elemento : colecao) {
			text += (elemento.toString() + "\n");
		}
		
		return text;
	}

	
	public E getElement(int i) {
		return colecao.get(i);
	}
	
}
