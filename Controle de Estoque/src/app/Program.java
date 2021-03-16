package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public Produto x = new Produto();

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Produto prod = new Produto();
		Scanner sc = new Scanner(System.in);
		
		String nome="", descricao="";
		int quantidade=0;
		double preco=0;
	

		int i = 1;
		while (i != 0) {

			System.out.println("O QUE DESEJA FAZER?\n" + "1 - CADASTRAR UM PRODUTO\n" + "2 - REMOVER UM PRODUTO\n"
					+ "3 - CONSULTAR O PRODUTO CADASTRADO\n" + "4 - SAIR");

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
				break;
			}

		
			System.out.println("Fim do programa.");
			
		}

	}

}
