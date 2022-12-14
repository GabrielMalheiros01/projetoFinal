package AirBnB;

public abstract class Locar {
	
	private String tipoLocacao;
	private int qtdPessoas;
	private int valor;
	private boolean disponibilidade;
	private String nomeCidade;
	private String nomeBairro;
	
	public Locar() {}
	
	public Locar(String tipoLocacao,int qtdPessoas, int valor, boolean disponibilidade,String nomeCidade,String nomeBairro) {
		this.tipoLocacao = tipoLocacao;
		this.valor = valor;
		this.qtdPessoas = qtdPessoas;
		this.disponibilidade = disponibilidade;
		this.nomeCidade = nomeCidade;
		this.nomeBairro = nomeBairro;
	}
	
	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}

	public String getTipoLocacao() {
		return tipoLocacao;
	}
	public void setTipoLocacao(String tipoAula) {
		this.tipoLocacao = tipoAula;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

}


