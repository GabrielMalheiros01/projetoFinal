package AirBnB;

import java.util.ArrayList;
import java.util.List;

public class Locador extends Usuario{
	List locacao = new ArrayList();
	
	public Locador() {}

	public Locador(String nome) {
		super(nome);
	}
	public Locador(List locacao) {
		this.locacao = locacao;
	}
	
	public void setNovaLocacao(Object x) {
		locacao.add(x);
	}
	public void removeLocacao(int index) {
		locacao.remove(index);
	}
	public void editarLocacao(int index,String coisa) {
		locacao.set(index, coisa);		
	}
	public void verLocacao(int index) {
		locacao.get(index);
	}

	
	
	
	
}
