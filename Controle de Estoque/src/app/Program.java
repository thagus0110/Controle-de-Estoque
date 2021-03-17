package app;

import java.util.Locale;
import java.util.Scanner;

import conn.Conexao;
import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		// INSTANCIAS
		Produto prod = new Produto();
		Scanner sc = new Scanner(System.in);

		// VARIAVEIS
		String nome = "", descricao = "";
		int quantidade = 0;
		double preco = 0;

		// LAÇO DE REPETIÇÃO P/ TESTES
		int i = 1;
		while (i != 0) {

			System.out.println("O QUE DESEJA FAZER?\n" + "1 - CADASTRAR UM PRODUTO\n" + "2 - REMOVER UM PRODUTO\n"
					+ "3 - CONSULTAR O PRODUTO CADASTRADO\n" + "4 - SAIR\n" + "5 - TESTAR BANCO");

			int esc = sc.nextInt();

			switch (esc) {
			case 1:
				System.out.print("\nDigite as informações do produto (Nome, Descrição, Quantidade e Preco): \n");
				nome = sc.next();
				descricao = sc.next();
				quantidade = sc.nextInt();
				preco = sc.nextDouble();

				prod.addProduto(nome, descricao, quantidade, preco);
				break;

			case 2:
				System.out.println();
				break;

			case 3:
				System.out.println("\n" + prod + "\n");
				break;

			case 4:
				i = 0;
				System.out.println("Fim do programa.");
				break;
				
			case 5:
				Conexao con = new Conexao();
				con.conectar();
				if(con.estaConectado()) {
					System.out.println("CONECTADO!");
				}
				
				else {
					System.out.println("ERRO!");
				}
			}

			System.out.println("\nFeito...\n");
						
		}

		sc.close();
	}

	
	
}
