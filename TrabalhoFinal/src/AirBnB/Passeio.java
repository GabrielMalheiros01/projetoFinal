package AirBnB;

public class Passeio extends Locar{

	
	public Passeio() {}
	
	public Passeio(String tipoAula, int valor, int qtdPessoas, boolean disponibilidade,String nomeCidade,String nomeBairro) {
		super(tipoAula ,valor,qtdPessoas,disponibilidade,nomeCidade,nomeBairro);
	}

}
