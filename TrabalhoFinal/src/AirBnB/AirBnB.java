package AirBnB;

import java.util.Scanner;

public class AirBnB {

	public static void main(String[] args) {
		
		int qtdValorMaximo;
		
		SuperUsuario s1 = new SuperUsuario();
		Cliente c1 = new Cliente();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		System.out.println("Qual seu nome?");
		String nome = scan.nextLine();
		System.out.println("Olá, "+nome+ "qual seu perfil?");
		System.out.println("1- Locador");
		System.out.println("2- Cliente");
		System.out.println("3- SuperUsuario");
		System.out.println("4- sair do programa");
		int x = scan.nextInt();
		System.out.println(x);
		
		if(x==1) {
			while(true) {
			Locador l1 = new Locador(nome);
			System.out.println("Qual ação vc deseja realizar?");
			System.out.println("1- Alugar imovel ");
			System.out.println("2- Remover imovel alugado");
			System.out.println("3- Ver imoveis disponiveis");
			System.out.println("4-Trocar perfil");
			int z = scan.nextInt();
			
			if(z==1) {
				while(true){
					System.out.println("Qual o tipo de aluguel?");
					System.out.println("1- Casa ");
					System.out.println("2- Aula");
					System.out.println("3- Passeio");
					System.out.println("4- Cancelar");
					int aluguel = scan.nextInt();
					if(aluguel == 1) {
						System.out.println("Digite o tipo de casa/apartamento:");
						String casa = scan.nextLine();
						System.out.println("Digite o valor do aluguel mensal:");
						int valorMensal = scan.nextInt();
						System.out.println("Digite a quantidade maxima de pessoas");
						int pessoas = scan.nextInt();
						System.out.println("Digite a cidade aonde está sendo alugada:");
						String cidade = scan.nextLine();
						System.out.println("Digite o bairro aonde está sendo alugada:");
						String bairro = scan.nextLine();
						Casas casa1 = new Casas(casa,valorMensal,pessoas,true,cidade,bairro);
						l1.setNovaLocacao(casa1);
					}
					
				}
			}else if(z==2) {
				
			}else if(z==3) {
				
			}else if(z==4) {
				break;
			}else {
				System.out.println("Digite um valor valido");
			}	
			}
			
		}else if(x==2) {
			while(true) {
			System.out.println("Qual ação vc deseja realizar?");
			System.out.println("1- Alugar imovel de outra pessoa");
			System.out.println("2- Remover imovel alugado");
			System.out.println("3- Ver imoveis disponiveis");
			int morsa = scan.nextInt();
			
			if(morsa == 1) {
				
			}
			
			}
		}else if(x==3) {
			while(true) {
			System.out.println("1- Ver imoveis disponiveis");
			System.out.println("2- Ver valor total alugado ");
			}
		}else if(x==4) {
			break;
			
		}else {
			System.out.println("numero invalido");
		}
		}
	}
	}


