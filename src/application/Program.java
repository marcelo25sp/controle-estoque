package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre com o número de produtos a ser cadastrados: ");
		int n = sc.nextInt();

		List<Produto> produtos = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite os dados do produto:");
			System.out.print("Código: ");
			int codigo = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			System.out.println();
			produtos.add(new Produto(codigo, nome, preco, quantidade));
		}

		System.out.println("Menu:");
		System.out.println("1 - Listar todos os produtos:");
		System.out.println("2 - Adicionar estoque:");
		System.out.println("3 - Remover estoque:");
		System.out.println("0 - Sair:");
		System.out.print("Escolha uma opção: ");
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("---Lista de produtos---");
				for(Produto p : produtos) {
					System.out.println(p);
					System.out.printf("Valor total no estoque: R$ %.2f%n", p.valorTotalNoEstoque());
					System.out.println("---------------------------------");
				}
				
		}



		sc.close();

	}

}
